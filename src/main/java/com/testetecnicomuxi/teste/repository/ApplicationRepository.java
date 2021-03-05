package com.testetecnicomuxi.teste.repository;

import com.testetecnicomuxi.teste.domain.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends MongoRepository<Application,Integer> {
    public List<Application> findAll();
}


