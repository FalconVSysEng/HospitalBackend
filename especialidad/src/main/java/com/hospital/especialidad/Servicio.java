package com.hospital.especialidad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    @Autowired
    private Repositorio repo;
    public especialidad grabar(especialidad esp){
        return repo.save(esp);
    }
    
    public especialidad buscar(Long id){
        return repo.findById(id).orElse(null);
    }
    
    public List<especialidad>listar(){
        return repo.findAll();
    }
    
    public especialidad actualizar(Long id,especialidad art){
        return repo.findById(id).map(existing->{
            existing.setNombre(art.getNombre());
            return repo.save(existing);
        }).orElse(null);
    }
    
    public void eliminar(Long id){
        repo.deleteById(id);
    }
}
