package lk.ijse.gdse66.customerservice.repo;

import lk.ijse.gdse66.customerservice.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Kavithma Thushal
 * @project : Vehicle-Service
 * @since : 10:38 AM - 6/24/2024
 **/
public interface VehicleRepo extends JpaRepository<VehicleEntity, String> {
}
