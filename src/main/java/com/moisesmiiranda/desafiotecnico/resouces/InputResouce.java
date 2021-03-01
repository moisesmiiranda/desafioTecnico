package com.moisesmiiranda.desafiotecnico.resouces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moisesmiiranda.desafiotecnico.domain.Input;

@RestController
@RequestMapping(value = "/inputs")
public class InputResouce {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Input> findAll(){
		//body 44332211;123;PWWIN;0;F04A2E4088B;4;8.00b3;0;16777216;PWWIN
		Input in = new Input(44332211, "123", "PWWIN",0,"F04A2E4088B",4,"8.00b3", 0,16777216,"PWWIN");
		List<Input> list = new ArrayList<>();
		list.addAll(Arrays.asList(in));
		return list;
	}

}
