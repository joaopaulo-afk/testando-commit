package com.api.astepi.services;

import com.api.astepi.models.SecretarioModel;
import com.api.astepi.repositories.SecretarioRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class SecretarioService {

    final SecretarioRepository secretarioRepository;

    public SecretarioService(SecretarioRepository secretarioRepository){
        this.secretarioRepository = secretarioRepository;
    }

    @Transactional
    public SecretarioModel save(SecretarioModel administradorModel) { return secretarioRepository.save(administradorModel); }
}
