package com.api.astepi.repositories;

import com.api.astepi.models.AdministradorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdministradorRepository extends JpaRepository<AdministradorModel, UUID>{

}
