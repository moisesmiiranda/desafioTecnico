package com.testetecnicomuxi.teste.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.testetecnicomuxi.teste.domain.Application;
import com.testetecnicomuxi.teste.repository.ApplicationRepository;

@Service
public class ApplicationService {
	private List<Application> listApp = new ArrayList();
	
	
	public ResponseEntity<List<Application>> save(Application app){
		listApp.add(app);
		return ResponseEntity.ok().body(listApp);
	}
	
	public ResponseEntity<List<Application>> returnList(){
		return ResponseEntity.ok().body(listApp);
	}
	
}
