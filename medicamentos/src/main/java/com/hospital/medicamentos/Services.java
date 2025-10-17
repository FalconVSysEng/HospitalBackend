package com.hospital.medicamentos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
  @Autowired
  private Repositorio repo;

  public Medicamentos grabar(Medicamentos med) {
    return repo.save(med);
  }

  public Medicamentos buscar(Long id) {
    return repo.findById(id).orElse(null);
  }

  public List<Medicamentos> listar() {
    return repo.findAll();
  }

  public Medicamentos actualizar(Long id, Medicamentos med) {
    return repo.findById(id).map(existing -> {
      existing.setNombre(med.getNombre());
      existing.setDescripcion(med.getDescripcion());
      existing.setConcentracion(med.getConcentracion());
      return repo.save(existing);
    }).orElse(null);
  }

  public void eliminar(Long id) {
    repo.deleteById(id);
  }
}
