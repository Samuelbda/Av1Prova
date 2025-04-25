package com.example.avaliacao.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.avaliacao.demo.Model.Categoria;
import com.example.avaliacao.demo.Model.Produto;
import com.example.avaliacao.demo.Repository.CategoriaRepository;
import com.example.avaliacao.demo.Repository.ProdutoRepository;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final CategoriaRepository categoriaRepository;

    public ProdutoService(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository) {
        this.produtoRepository = produtoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    public Produto salvar(Produto produto) {
        if (produto.getCategoria() != null && produto.getCategoria().getId() != null) {
            Categoria categoriaExistente = categoriaRepository.findById(produto.getCategoria().getId())
                    .orElseThrow(() -> new RuntimeException("Categoria não encontrada com o ID: " + produto.getCategoria().getId()));
            produto.setCategoria(categoriaExistente);
        }
        return produtoRepository.save(produto);
    }

    public void deletar(Long id) {
        produtoRepository.deleteById(id); 
    }
}
