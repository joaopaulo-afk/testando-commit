package com.api.astepi.controllers;


import com.api.astepi.dtos.SecretarioDto;
import com.api.astepi.models.SecretarioModel;
import com.api.astepi.services.SecretarioService;


import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/SecretarioModel")

public class SecretarioController {

    final SecretarioService secretarioService;

    public SecretarioController(SecretarioService secretarioService) { this.secretarioService = secretarioService; }

    @PostMapping
    public ResponseEntity<Object> saveSecretario(@RequestBody @Valid SecretarioDto secretarioDto){
        var secretarioModel = new SecretarioModel();
        BeanUtils.copyProperties(secretarioDto,secretarioModel);
        secretarioModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(secretarioService.save(secretarioModel));
    }


}
