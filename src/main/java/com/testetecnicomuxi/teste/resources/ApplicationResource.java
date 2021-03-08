package com.testetecnicomuxi.teste.resources;

import com.testetecnicomuxi.teste.domain.Application;
import com.testetecnicomuxi.teste.services.ApplicationService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/")
public class ApplicationResource {
	public ApplicationService service;

	@RequestMapping(method = RequestMethod.GET) // encontrar todos
	public ResponseEntity<List<Application>> findAll() {
		// 44332211;123;PWWIN;0;F04A2E4088B;4;8.00b3;0;16777216;PWWIN
		List<Application> list = new ArrayList<>();
		list = (List<Application>) service.returnList();
		return ResponseEntity.ok().body(list);
	}

	// url [versão da aplicação]/[nome da entidade]/[atributo 'logic']
	@RequestMapping(method = RequestMethod.GET, value = "/version/applications/{logic}") // encontra por logic
	public ResponseEntity<List<Application>> findByLogic() {
		List<Application> list = new ArrayList<>();
		return ResponseEntity.ok().body(list);
	}

	@PostMapping("/version/applications/")
	//@RequestMapping(method = RequestMethod.POST, value = "/v1/applications/")
	public ResponseEntity<Application> input(@RequestBody String input) {
		String[] temp = input.split(";");

		Application app = new Application();

		app.setLogic(Integer.parseInt(temp[0]));
		app.setSerial(temp[1]);
		app.setModel(temp[2]);
		app.setSam(Integer.parseInt(temp[3]));
		app.setPtid(temp[4]);
		app.setPlat(Integer.parseInt(temp[5]));
		app.setVersion(temp[6]);
		app.setMxr(Integer.parseInt(temp[7]));
		app.setMxf(Integer.parseInt(temp[8]));
		app.setVerfm(temp[9]);

		service.save(app);// salvando o obj

		return ResponseEntity.accepted().build();

	}

}
