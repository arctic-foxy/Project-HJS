package com.hjspizza.sistema_pizzaria.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data // Essa anotação cria automaticamente os Getters, Setters e o toString
@NoArgsConstructor // Cria o construtor vazio obrigatório
@AllArgsConstructor // Cria um construtor com todos os campos
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    @Column(columnDefinition = "TEXT") // Define que a descrição pode ser um texto longo no banco
    private String descricao;
    
    private Double preco;
    
    private String categoria;
    
    private boolean ativo;
}