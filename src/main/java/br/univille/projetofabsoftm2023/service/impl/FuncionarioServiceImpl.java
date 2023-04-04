package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.univille.projetofabsoftm2023.entity.Funcionario;
import br.univille.projetofabsoftm2023.service.FuncionarioService;
import repository.FuncionarioRepository;

public class FuncionarioServiceImpl
        implements FuncionarioService {

            @Autowired
            private FuncionarioRepository repository;

            
    @Override
    public List<Funcionario> getALL() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getALL'");
    }
    
}
