package com.api.astepi.controllers;

import com.api.astepi.dtos.AdministradorDto;
import com.api.astepi.models.AdministradorModel;
import com.api.astepi.services.AdministradorService;


import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/AdministradorModel")

public class AdministradorController {

        final AdministradorService administradorService;

        public AdministradorController(AdministradorService administradorService) {
            this.administradorService = administradorService;
        }

        @PostMapping
        public ResponseEntity<Object> saveAdministrador(@RequestBody @Valid AdministradorDto administradorDto){
            var administradorModel = new AdministradorModel();
            BeanUtils.copyProperties(administradorDto,administradorModel);
            administradorModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
            return ResponseEntity.status(HttpStatus.CREATED).body(administradorService.save(administradorModel));
        }
    }
