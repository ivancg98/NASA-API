package com.example.spqr.IService;

import java.util.List;

import com.example.spqr.model.Planeta;


public interface IPlanetaService {
	
	public Planeta createPlaneta(Planeta planeta);
	public void deletePlaneta(String id);
	public Planeta updatePlaneta(Planeta planeta);
	public Planeta getPlaneta(String id);
	public List<Planeta> getAllPlanetes();
	

}
