package lk.ijse.gdse66.customerservice.service;

import lk.ijse.gdse66.customerservice.dto.CustomerDTO;
import lk.ijse.gdse66.customerservice.entity.CustomerEntity;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Customer-Service
 * @since : 10:36 AM - 6/24/2024
 **/
public interface CustomerService {

    void saveCustomer(CustomerDTO customerDTO);

    CustomerDTO searchCustomer(String id);

    void updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String id);

    List<CustomerEntity> loadAllCustomers();
}
