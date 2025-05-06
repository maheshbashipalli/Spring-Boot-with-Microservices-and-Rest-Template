package com.vcube.address_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vcube.address_service.response.AddressResponse;
import com.vcube.address_service.service.AddressService;
@Controller
public class AddressController {
	
	
	
	
	@Autowired
	private AddressService addressService;
	@GetMapping("/address/{eid}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("eid") int eid) {
	AddressResponse addressResponse = addressService.findAddressByEmployeeId(eid);
	return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	
	}

	

}
