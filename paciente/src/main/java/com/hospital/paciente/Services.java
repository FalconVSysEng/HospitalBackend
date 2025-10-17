package com.hospital.paciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
  @Autowired
  private Repositorio repo;

  public Paciente grabar(Paciente pac) {
    return repo.save(pac);
  }

  public Paciente buscar(Long id) {
    return repo.findById(id).orElse(null);
  }

  public List<Paciente> listar() {
    return repo.findAll();
  }

  public Paciente actualizar(Long id, Paciente pac) {
    return repo.findById(id).map(existing -> {
      existing.setDni_paciente(pac.getDni_paciente());
      existing.setNombre(pac.getNombre());
      existing.setApellido(pac.getApellido());
      existing.setDireccion(pac.getDireccion());
      existing.setTelefono(pac.getTelefono());
      existing.setFechaNacimiento(pac.getFechaNacimiento());
      existing.setSexo(pac.getSexo());
      return repo.save(existing);
    }).orElse(null);
  }

  public void eliminar(Long id) {
    repo.deleteById(id);
  }
  
}
