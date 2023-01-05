package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.bindings.PassengerInfo;
import com.ashokit.bindings.TicketInfo;

@RestController
public class TicketRestController {

	@PostMapping(value = "/ticket",
			produces = {"application/json"},
			consumes = {"application/json"})
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request){
		System.out.println(request);
		TicketInfo info = new TicketInfo();
		info.setTktid(1234);
		info.setPnr("JNR1334H");
		info.setTicketStatus("CONFIRMED");
		
		return new ResponseEntity(info, HttpStatus.CREATED);
	}
}
