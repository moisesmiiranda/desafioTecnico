package com.testetecnicomuxi.teste.resources;

import com.testetecnicomuxi.teste.domain.Application;
import com.testetecnicomuxi.teste.dto.ApplicationDTO;
import com.testetecnicomuxi.teste.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/app")
public class ApplicationResource {

    @Autowired
    private ApplicationService service;
    //endpoint para listar todos os dados
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity <List<Application>> findAll(){
        //44332211;123;PWWIN;0;F04A2E4088B;4;8.00b3;0;16777216;PWWIN
        List<Application> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    //Enpoint para inserir dados
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody ApplicationDTO objDTO){
        Application app = service.fromDTO(objDTO);
        app = service.insert(app);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(app.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }
}
