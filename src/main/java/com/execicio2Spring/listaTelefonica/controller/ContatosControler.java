package com.execicio2Spring.listaTelefonica.controller;


import com.execicio2Spring.listaTelefonica.model.ContatosModel;
import com.execicio2Spring.listaTelefonica.service.ContatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContatosControler {

    @Autowired
    private ContatosService service;

    @GetMapping(path = "/agenda")
    public List<ContatosModel> buscarContatos(){
        return service.buscarTodosContatos();
    }

    @GetMapping(path = "/agenda/{codigo}")
    public Optional<ContatosModel> buscarContatoPorId(@PathVariable Long codigo){
        return service.buscarPorId(codigo);
    }

    @PostMapping(path = "/agenda")
    public ContatosModel cadastrarContato(@RequestBody ContatosModel contato){
        return service.cadastrarContato(contato);
    }

    @PutMapping(path = "/agenda/{codigo}")
    public ContatosModel alterarContato(@RequestBody ContatosModel contato){
        return service.alterarContato(contato);
    }

    @DeleteMapping(path = "/agenda/{codigo}")
    public void deletarContato(@PathVariable Long codigo){
        service.deletarContato(codigo);
    }



}
