package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Phone;

@Repository
public interface PhoneRepo extends JpaRepository<Phone, Long>{

}
