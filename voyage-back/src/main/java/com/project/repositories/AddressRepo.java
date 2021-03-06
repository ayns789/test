package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.entities.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long>{

	
}
