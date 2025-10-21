package com.hospital.empleado.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.empleado.Entity.EmpleadoEntity;
import com.hospital.empleado.Repository.EmpleadoRepository;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository repo;
    
    public List<EmpleadoEntity> listarEmpleados() {
        return repo.findAll();
    }

    public EmpleadoEntity agregarEmpleado(EmpleadoEntity empleado) {
        return repo.save(empleado);
    }
    public EmpleadoEntity actualizarEmpleado(Long id, EmpleadoEntity empleado) {
        empleado.setId_Empleado(id);
        return repo.save(empleado);
    }
    public EmpleadoEntity desactivarEmpleado(Long id) {
        EmpleadoEntity empleado = repo.findById(id)
            .orElseThrow(() -> new RuntimeException("Empleado no encontrado con id: " + id));

        empleado.setEstado_Empleado(false);
        return repo.save(empleado);
    }
}
