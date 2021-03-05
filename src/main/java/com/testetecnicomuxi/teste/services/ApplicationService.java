package com.testetecnicomuxi.teste.services;

import com.testetecnicomuxi.teste.domain.Application;
import com.testetecnicomuxi.teste.dto.ApplicationDTO;
import com.testetecnicomuxi.teste.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository repo;

    List<Application> list = new ArrayList<>();

    public List<Application> findAll(){
        return repo.findAll();
    }

    public Application insert(Application app){
        return repo.insert(app);
    }
//Integer logic, String serial, String model, Integer sam, String ptid, Integer plat, String version, Integer mxr, Integer mxf, String verf
    public Application fromDTO(ApplicationDTO objDto){
        return new Application(objDto.getId(),objDto.getLogic(), objDto.getSerial(), objDto.getModel(), objDto.getSam(), objDto.getPtid(), objDto.getPlat(), objDto.getVersion(), objDto.getMxr(), objDto.getMxf(), objDto.getVerfm());
    }

}
