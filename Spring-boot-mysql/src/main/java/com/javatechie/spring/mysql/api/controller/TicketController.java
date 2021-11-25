package com.javatechie.spring.mysql.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.mysql.api.dao.TicketDao;
import com.javatechie.spring.mysql.api.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao dao;

	@PostMapping("/bookTickets")
	public String bookTicket() {
		List<Ticket> tickets = new ArrayList<>();
		tickets.add(new Ticket(1, 20.2,"abc"));
		tickets.add(new Ticket(2, 20.2,"xyz"));
		dao.save(tickets);
		return "ticket booked : " + tickets.size();
	}

	@GetMapping("/getTickets")
	public List<Ticket> getTickets() {
		return (List<Ticket>) dao.findAll();
	}

}
