package com.example.avaliacao.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.avaliacao.demo.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}