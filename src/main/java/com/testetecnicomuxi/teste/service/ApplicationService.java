package com.testetecnicomuxi.teste.service;

import com.testetecnicomuxi.teste.domain.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> findAll();//lista todos
    Application updateData();//atualizara os dados

}
