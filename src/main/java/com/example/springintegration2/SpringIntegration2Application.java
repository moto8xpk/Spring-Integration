package com.example.springintegration2;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SpringIntegration2Application {

    public static void main(String... args) {
        AbstractApplicationContext context
                = new AnnotationConfigApplicationContext(BasicIntegrationConfig.class);
        context.registerShutdownHook();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter q and press <enter> to exit the program: ");

        while (true) {
            String input = scanner.nextLine();
            if("q".equals(input.trim())) {
                break;
            }
        }
        System.exit(0);
//        SpringApplication.run(SpringIntegration2Application.class, args);
    }

}
