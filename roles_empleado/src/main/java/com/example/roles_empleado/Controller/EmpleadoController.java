package com.example.roles_empleado.Controller;

import com.example.roles_empleado.Entity.EmpleadoEntity;
import com.example.roles_empleado.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoRepository repo;
    @GetMapping("/listar")
    public List<EmpleadoEntity> listarUsuarios() {
        return repo.findAll();
    }
    @PostMapping("/agregar")
    public EmpleadoEntity agregarUsuario(@RequestBody EmpleadoEntity empleado) {
        return repo.save(empleado);
    }
}
