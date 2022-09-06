package com.example.spqr.resolver;

import java.util.List;

import com.example.spqr.model.Planeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spqr.IService.IPlanetaService;


import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;

@Component
public class PlanetaResolver {
	
	@Autowired
	private IPlanetaService planetaService;
	
	@GraphQLMutation(name="createPlaneta")
	public Planeta createPlaneta(@GraphQLArgument(name="details") Planeta planeta) {
		return planetaService.createPlaneta(planeta);
	}
	
	@GraphQLQuery(name="getAllPlanetes")
	public List<Planeta> getAllPlanetes() {
		return planetaService.getAllPlanetes();
	}
	
	@GraphQLMutation(name="updatePlaneta")
	public Planeta updatePlaneta(@GraphQLArgument(name="details") Planeta planeta) {
		return planetaService.updatePlaneta(planeta);
	}
	
	@GraphQLMutation(name="deletePlaneta")
	public Boolean deletePlaneta(@GraphQLArgument(name="planetaId") String id) {
		 planetaService.deletePlaneta(id);
		 return true;
	}
	
	@GraphQLQuery(name="getPlaneta")
	public Planeta getPlaneta(@GraphQLArgument(name="planetaId") String id) {
		return planetaService.getPlaneta(id);
	}
	

}
