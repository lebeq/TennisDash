package org.javalearning.tennisdash;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

//once DB is added, remove the (...) after SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TennisDashApplication {

    public static void main(String[] args) {

        SpringApplication.run(TennisDashApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Let's inspect da beanz provided by Spring boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName: beanNames){
                System.out.println(beanName);
            }
        };
    }

}
