package lk.ijse.gdse66.customerservice.repo;

import lk.ijse.gdse66.customerservice.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Kavithma Thushal
 * @project : Customer-Service
 * @since : 10:38 AM - 6/24/2024
 **/
public interface CustomerRepo extends JpaRepository<CustomerEntity, String> {
}
