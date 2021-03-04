package com.testetecnicomuxi.teste.resources;

import com.testetecnicomuxi.teste.domain.Terminal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/terminals")
public class TerminalResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity <List<Terminal>> findAll(){
        //44332211;123;PWWIN;0;F04A2E4088B;4;8.00b3;0;16777216;PWWIN
        Terminal t1 = new Terminal(44332211,"123",
                "PWWIN",0,"F04A2E4088B",4,
                "8.00b3",0,16777216,"PWWIN");

        List<Terminal> list = new ArrayList<>();
        list.addAll(Arrays.asList(t1));
        return ResponseEntity.ok().body(list);

    }
}
