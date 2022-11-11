package com.api.astepi.services;

import com.api.astepi.models.PessoaModel;
import com.api.astepi.repositories.PessoaRepository;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PessoaService {
    final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    @Transactional
    public PessoaModel save(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }
}
