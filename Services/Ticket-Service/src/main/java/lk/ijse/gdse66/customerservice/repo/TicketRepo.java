package lk.ijse.gdse66.customerservice.repo;

import lk.ijse.gdse66.customerservice.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Kavithma Thushal
 * @project : Ticket-Service
 * @since : 10:38 AM - 6/24/2024
 **/
public interface TicketRepo extends JpaRepository<TicketEntity, String> {
}
