package com.api.astepi.services;

import com.api.astepi.models.AdministradorModel;
import com.api.astepi.repositories.AdministradorRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AdministradorService {

    final AdministradorRepository administradorRepository;

    public AdministradorService(AdministradorRepository administradorRepository){
        this.administradorRepository = administradorRepository;
    }

    @Transactional //caso dê errado na transação com DB, essa anotação garante que ñ tenham dados quebrados
    public AdministradorModel save(AdministradorModel administradorModel) { return administradorRepository.save(administradorModel); }
}
