package com.example.avaliacao.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.example.avaliacao.demo.Model.Categoria;
import com.example.avaliacao.demo.Service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

        private final CategoriaService service;
    
        public CategoriaController(CategoriaService service) {
            this.service = service;
        }
    
        @GetMapping
        public List<Categoria> listar() {
            return service.listar();
        }
    
        @PostMapping
        public Categoria salvar(@RequestBody Categoria categoria) {
            return service.salvar(categoria);
        }
    
        @DeleteMapping("/{id}")
        public void deletar(@PathVariable Long id) {
            service.deletar(id);
        }
}
    