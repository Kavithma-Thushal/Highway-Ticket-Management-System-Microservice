package lk.ijse.gdse66.customerservice.api;

import lk.ijse.gdse66.customerservice.dto.TicketDTO;
import lk.ijse.gdse66.customerservice.entity.TicketEntity;
import lk.ijse.gdse66.customerservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Ticket-Service
 * @since : 9:47 PM - 6/23/2024
 **/
@RestController
@RequestMapping("/api/v1/ticket")
public class TicketAPI {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public TicketService ticketService;

    @PostMapping("/saveTicket")
    public void saveTicket(@RequestBody TicketDTO ticketDTO) {
        ticketService.saveTicket(ticketDTO);
    }

    @GetMapping("/searchTicket/{id}")
    public TicketDTO searchTicket(@PathVariable String id) {
        return ticketService.searchTicket(id);
    }

    @PutMapping("/updateTicket")
    public void updateTicket(@RequestBody TicketDTO ticketDTO) {
        ticketService.updateTicket(ticketDTO);
    }

    @DeleteMapping("/deleteTicket/{id}")
    public void deleteUserTicket(@PathVariable String id) {
        ticketService.deleteTicket(id);
    }

    @GetMapping("/loadAllTickets")
    public List<TicketEntity> loadAllTickets() {
        return ticketService.loadAllTickets();
    }
}