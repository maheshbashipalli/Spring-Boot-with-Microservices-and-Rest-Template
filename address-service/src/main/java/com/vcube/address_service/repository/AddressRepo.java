package com.vcube.address_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vcube.address_service.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
	
	 @Query(
		        nativeQuery = true,
		        value = "SELECT ea.id, ea.city, ea.state FROM address ea " +
		                "JOIN employee2 e ON e.id = ea.id " +
		                "WHERE ea.id = :eid"
		    )
			Optional<Address> findAddressByEmployeeId(@Param("eid") int eid);
	
	
	
}
	