package com.hospital.empleado.Repository;
import com.hospital.empleado.Entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {
}
