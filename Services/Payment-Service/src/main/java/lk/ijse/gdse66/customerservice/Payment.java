package lk.ijse.gdse66.customerservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Kavithma Thushal
 * @project : Payment-Service
 * @since : 9:47 PM - 6/23/2024
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Payment {

    public static void main(String[] args) {
        SpringApplication.run(Payment.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}