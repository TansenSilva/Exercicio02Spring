package com.execicio2Spring.listaTelefonica.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "agenda")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ContatosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoContato;

    @Column(length = 50, nullable = false)
    private String nomeContato;

    @Column(length = 15, nullable = false)
    private String telefone;

}
