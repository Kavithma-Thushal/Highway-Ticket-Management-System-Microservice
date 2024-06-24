package lk.ijse.gdse66.customerservice.service;

import lk.ijse.gdse66.customerservice.dto.TicketDTO;
import lk.ijse.gdse66.customerservice.entity.TicketEntity;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Ticket-Service
 * @since : 10:36 AM - 6/24/2024
 **/
public interface TicketService {

    void saveTicket(TicketDTO ticketDTO);

    TicketDTO searchTicket(String id);

    void updateTicket(TicketDTO ticketDTO);

    void deleteTicket(String id);

    List<TicketEntity> loadAllTickets();
}
