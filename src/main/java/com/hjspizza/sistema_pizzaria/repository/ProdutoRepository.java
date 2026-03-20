package com.hjspizza.sistema_pizzaria.repository;

import com.hjspizza.sistema_pizzaria.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Aqui o Spring Boot cria automaticamente o:
    // .save(produto) -> Para salvar a pizza
    // .findAll()     -> Para listar todas
    // .delete(id)    -> Para excluir
}