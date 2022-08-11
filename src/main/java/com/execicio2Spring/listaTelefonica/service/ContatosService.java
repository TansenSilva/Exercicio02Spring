package com.execicio2Spring.listaTelefonica.service;

import com.execicio2Spring.listaTelefonica.model.ContatosModel;
import com.execicio2Spring.listaTelefonica.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosService {

    @Autowired
    private ContatosRepository repository;

    public List<ContatosModel> buscarTodosContatos(){
        return repository.findAll();
    }

    public Optional<ContatosModel> buscarPorId(Long codigo){
        return repository.findById(codigo);
    }

    public ContatosModel cadastrarContato(ContatosModel contato){
        contato.getNomeContato();
        contato.getTelefone();
        return repository.save(contato);
    }

    public ContatosModel alterarContato(ContatosModel contato){
        contato.getNomeContato();
        contato.getTelefone();
        return repository.save(contato);
    }

    public void deletarContato(Long codigo){
        repository.deleteById(codigo);
    }


}
