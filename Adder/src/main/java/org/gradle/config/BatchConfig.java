
package org.gradle.config;
import java.io.File;
import java.io.IOException;
import java.util.List;


import javax.xml.bind.JAXBElement;


import org.gradle.Adder;
import org.gradle.Interface.StoreInterface;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Lazy
@Configuration
@EnableBatchProcessing
@EnableTransactionManagement
@ComponentScan("org.gradle")
@PropertySource("classpath:application.properties")
public class BatchConfig {

/*	@Autowired
	ApplicationContext appContext;
*/
@Autowired
@Qualifier("batchStep")
private Step batchStep;
@Autowired
ItemReader<StoreInterface> reader;
@Autowired
ItemProcessor<StoreInterface,StoreInterface> adder;
@Autowired
ItemWriter<StoreInterface> writer;

	/**
	 * build a batch job using a batch based approach.
	 *
	 * @param jobs
	 *            -
	 *            {@link org.springframework.batch.core.configuration.annotation.JobBuilderFactory}
	 *
	 * @return Job -{@link org.springframework.batch.core.Job}
	 */
	@Bean
	public org.springframework.batch.core.Job importBatchJob(JobBuilderFactory jobs) {
		System.out.println("first call");
		return jobs.get("batch")
				.incrementer(new RunIdIncrementer())
				.flow(batchStep)
				.end()
				.build();
	}


/*	@Bean
	public Step batchStep(StepBuilderFactory stepBuilderFactory, ItemReader<StoreInterface> reader,
			ItemProcessor<StoreInterface,StoreInterface> adder,
			ItemWriter<StoreInterface> writer) {
		System.out.println("inside batchconfig");
		return stepBuilderFactory
				.get("name").<StoreInterface,StoreInterface> chunk(1)
				.reader(reader)//(reader)
				.processor(adder)
				.writer(writer).build();
	}
*/
	@Bean
	public Step batchStep(StepBuilderFactory stepBuilderFactory) {
		System.out.println("inside batchconfig");
		return stepBuilderFactory
				.get("name").<StoreInterface,StoreInterface> chunk(1)
				.reader(reader)
				.processor(adder)
				.writer(writer).build();
	}
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
	

