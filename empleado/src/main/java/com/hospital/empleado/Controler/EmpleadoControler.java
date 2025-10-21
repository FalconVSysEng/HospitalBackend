package com.hospital.empleado.Controler;

import com.hospital.empleado.Entity.EmpleadoEntity;
import com.hospital.empleado.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoControler {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/listar")
    public List<EmpleadoEntity> listarUsuarios() {
        return empleadoService.listarEmpleados();
    }

    @PostMapping("/agregar")
    public EmpleadoEntity agregarUsuario(@RequestBody EmpleadoEntity empleado) {
        if (empleado.getEstado_Empleado() == null) {
            empleado.setEstado_Empleado(true);
        }
        return empleadoService.agregarEmpleado(empleado);
    }
    @PutMapping("/actualizar/{id}")
    public EmpleadoEntity actualizar(@PathVariable Long id, @RequestBody EmpleadoEntity empleado) {
        return empleadoService.actualizarEmpleado(id, empleado);
    }
    @PutMapping("/desactivar/{id}")
    public EmpleadoEntity desactivar(@PathVariable Long id) {
        return empleadoService.desactivarEmpleado(id);
    }
}
