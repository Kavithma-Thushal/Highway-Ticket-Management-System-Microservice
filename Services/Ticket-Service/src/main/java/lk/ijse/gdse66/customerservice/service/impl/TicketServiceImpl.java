package lk.ijse.gdse66.customerservice.service.impl;

import lk.ijse.gdse66.customerservice.dto.TicketDTO;
import lk.ijse.gdse66.customerservice.entity.TicketEntity;
import lk.ijse.gdse66.customerservice.repo.TicketRepo;
import lk.ijse.gdse66.customerservice.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Ticket-Service
 * @since : 10:37 AM - 6/24/2024
 **/
@Service
@Transactional
public class TicketServiceImpl implements TicketService {

    @Autowired
    public ModelMapper modelMapper;

    @Autowired
    public TicketRepo ticketRepo;

    @Override
    public void saveTicket(TicketDTO ticketDTO) {
        if (!ticketRepo.existsById(ticketDTO.getTicket_id())) {
            ticketRepo.save(modelMapper.map(ticketDTO, TicketEntity.class));
        }
    }

    @Override
    public TicketDTO searchTicket(String id) {
        return ticketRepo.findById(id).map(ticketEntity -> modelMapper.map(ticketEntity, TicketDTO.class)).orElse(null);
    }

    @Override
    public void updateTicket(TicketDTO ticketDTO) {
        ticketRepo.save(modelMapper.map(ticketDTO, TicketEntity.class));
    }

    @Override
    public void deleteTicket(String id) {
        ticketRepo.deleteById(id);
    }

    @Override
    public List<TicketEntity> loadAllTickets() {
        return ticketRepo.findAll();
    }
}
