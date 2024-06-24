package lk.ijse.gdse66.customerservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Kavithma Thushal
 * @project : Vehicle-Service
 * @since : 10:37 AM - 6/24/2024
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vehicle")
public class VehicleEntity {
    @Id
    private String vehicle_id;
    private String vehicle_name;
    private String vehicle_model;
    private String vehicle_color;
}
