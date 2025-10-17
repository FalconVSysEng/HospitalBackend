package com.hospital.paciente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository<Paciente, Long> {

}
