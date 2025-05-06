package com.vcube.address_service.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.address_service.entity.Address;
import com.vcube.address_service.repository.AddressRepo;
import com.vcube.address_service.response.AddressResponse;

@Service
public class AddressService {
	
	
	@Autowired
	private AddressRepo addressRepo;
	@Autowired
	private ModelMapper mapper;
	public AddressResponse findAddressByEmployeeId(int eid) {
	Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(eid);
	AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
	return addressResponse;
	}
	}
	


