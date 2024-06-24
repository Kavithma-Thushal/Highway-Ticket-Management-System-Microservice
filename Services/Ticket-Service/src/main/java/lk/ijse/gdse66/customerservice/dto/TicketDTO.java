package lk.ijse.gdse66.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Kavithma Thushal
 * @project : Ticket-Service
 * @since : 9:49 PM - 6/23/2024
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TicketDTO {
    private String ticket_id;
    private String ticket_description;
    private String ticket_price;
    private String ticket_quantity;
}
