package co.paan.application;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hungnguyen on 12/28/14.
 */
@Configuration
@ComponentScan(basePackages = "co.paan")
//@EnableAutoConfiguration(exclude = {ElasticsearchConfiguration.class})
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class);
    }
}
