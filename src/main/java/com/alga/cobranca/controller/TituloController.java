package com.alga.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloController {

    @RequestMapping("/titulos/novo")
    public String novo(){
        return "CadastroTitulo";
    }

}
