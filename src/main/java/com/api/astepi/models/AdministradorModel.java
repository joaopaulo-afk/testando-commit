package com.api.astepi.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_ADMINISTRADOR")
public class AdministradorModel implements Serializable {
        private static final long serialVersionUID = 1l;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;

        @Column(nullable = false)
        private LocalDateTime registrationDate;

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }

        public LocalDateTime getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(LocalDateTime registrationDate) {
            this.registrationDate = registrationDate;
        }
}
