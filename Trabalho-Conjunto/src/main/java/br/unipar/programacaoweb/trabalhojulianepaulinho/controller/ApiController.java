package br.unipar.programacaoweb.trabalhojulianepaulinho.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
public class ApiController {

    @GetMapping("/FiltroVendas")
    public String vendasFiltro(){
        return "FiltroVendas";
    }

}
