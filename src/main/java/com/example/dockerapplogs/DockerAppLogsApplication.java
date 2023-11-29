package com.example.dockerapplogs;

import com.example.dockerapplogs.threads.RunnerOne;
import com.example.dockerapplogs.threads.RunnerThree;
import com.example.dockerapplogs.threads.RunnerTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerAppLogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerAppLogsApplication.class, args);


        Thread threadOne = new Thread(new RunnerOne());
        threadOne.start();

        Thread threadTwo = new Thread(new RunnerTwo());
        threadTwo.start();

        Thread threadThree = new Thread(new RunnerThree());
        threadThree.start();


    }

}
