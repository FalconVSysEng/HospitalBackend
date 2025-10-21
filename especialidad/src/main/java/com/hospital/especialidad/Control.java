package com.hospital.especialidad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/especialidad")
public class Control {
    @Autowired
    private Servicio serv;

    @PostMapping("/grabar")
    public especialidad grabar(@RequestBody especialidad esp){
        return serv.grabar(esp);
    }
    
    @GetMapping("/buscar/{id}")
    public especialidad buscar(@PathVariable Long id){
        return serv.buscar(id);
    }
    
    @GetMapping("/listar")
    public List<especialidad>listar(){
        return serv.listar();
    }
    
    @PutMapping("/actualizar/{id}")
    public especialidad actualizar(@PathVariable Long id,@RequestBody especialidad art){
        return serv.actualizar(id, art);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        serv.eliminar(id);
    }
}
