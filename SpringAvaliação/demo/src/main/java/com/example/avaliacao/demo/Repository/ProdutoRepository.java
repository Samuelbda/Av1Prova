package com.example.avaliacao.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.avaliacao.demo.Model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto,Long> {
    
}
