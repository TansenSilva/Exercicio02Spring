package com.execicio2Spring.listaTelefonica.repository;


import com.execicio2Spring.listaTelefonica.model.ContatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends JpaRepository<ContatosModel,Long> {
}
