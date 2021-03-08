package com.testetecnicomuxi.teste.repository;

import com.testetecnicomuxi.teste.domain.Application;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository  {
    public List<Application> findAll();
    
    public List<Application> insert(Application app);
}


