package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.univille.projetofabsoftm2023.entity.Produto;
import br.univille.projetofabsoftm2023.repository.ProdutoRepository;
import br.univille.projetofabsoftm2023.service.ProdutoService;

public class ProdutoServiceImpl 
    implements ProdutoService{

    @Autowired
    private ProdutoRepository repository;

    @Override
    public List<Produto> getAll() {
        return repository.findALL();
    }

}
