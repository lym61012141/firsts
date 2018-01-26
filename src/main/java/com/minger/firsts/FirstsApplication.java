package com.minger.firsts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class FirstsApplication {

	public static void main(String[] args) {
		/*在spring-boot中无需xml配置,由这个主线程进行启动应用*/
		SpringApplication.run(FirstsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		/*
		* 下面的程序会检索应用程序创建的所有bean，或者由于spring启动而自动添加的bean。
		* 将它们分类并打印出来。
		*/
		return args -> {

			System.out.println("打印spring启动时注入的bean:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			/*for (String beanName : beanNames) {
				System.out.println(beanName);
			}*/

		};
	}
}
