package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Service;

@Repository
public interface ServiceRepo extends JpaRepository<Service, Long>{

}
