package lk.ijse.gdse66.customerservice.api;

import lk.ijse.gdse66.customerservice.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Kavithma Thushal
 * @project : Customer-Service
 * @since : 9:47 PM - 6/23/2024
 **/
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerAPI {

    @Autowired
    public RestTemplate restTemplate;

    @PostMapping("/saveCustomer")
    public void saveCustomer(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.getId());
        System.out.println(customerDTO.getName());
        System.out.println(customerDTO.getAddress());
        System.out.println(customerDTO.getSalary());
    }

    @GetMapping("/searchCustomer")
    public String searchCustomer() {
        return "C00-001, Kavithma Thushal, Galle, 90000";
    }
}