package com.project.services;

import java.util.List;

import com.project.dtos.admin.EstablishmentCreateDto;
import com.project.dtos.user.EstablishmentViewDto;
import com.project.dtos.user.LikeEstablishmentDto;

public interface EstablishmentService {
	
	List<EstablishmentViewDto> getAll();

	EstablishmentViewDto getOne(Long id);
	
void create(EstablishmentCreateDto establishment);
	
EstablishmentCreateDto one(Long id);
	
	void update(Long id, EstablishmentCreateDto establishment);
	
	void delete(Long id);

	void like(LikeEstablishmentDto dto);

	void unlike(LikeEstablishmentDto dto);

}
