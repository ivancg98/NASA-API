package com.example.spqr.serviceImpl;

import java.util.List;

import com.example.spqr.model.Planeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spqr.IService.IPlanetaService;
import com.example.spqr.repository.PlanetaRepository;

@Service
public class PlanetaServiceImpl implements IPlanetaService{

	@Autowired
	private PlanetaRepository planetaRepository;

	@Override
	public Planeta createPlaneta(Planeta planeta) {
		return planetaRepository.save(planeta);
	}

	@Override
	public void deletePlaneta(String id) {
		planetaRepository.deleteById(id);
		
	}

	@Override
	public Planeta updatePlaneta(Planeta planeta) {
		return planetaRepository.save(planeta);
	}

	@Override
	public Planeta getPlaneta(String id) {
		return planetaRepository.findById(id).get();
	}

	@Override
	public List<Planeta> getAllPlanetes() {
		return planetaRepository.findAll();
	}
	
	
}
