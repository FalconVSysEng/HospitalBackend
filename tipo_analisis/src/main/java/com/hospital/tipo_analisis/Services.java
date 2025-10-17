package com.hospital.tipo_analisis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
  @Autowired
  private Repositorio repo;

  public TipoAnalisis grabar(TipoAnalisis tip) {
    return repo.save(tip);
  }

  public TipoAnalisis buscar(Long id) {
    return repo.findById(id).orElse(null);
  }

  public List<TipoAnalisis> listar() {
    return repo.findAll();
  }

  public TipoAnalisis actualizar(Long id, TipoAnalisis tip) {
    return repo.findById(id).map(existing -> {
      existing.setNombre(tip.getNombre());
      existing.setDescripcion((tip.getDescripcion()));
      return repo.save(existing);
    }).orElse(null);
  }

  public void eliminar(Long id) {
    repo.deleteById(id);
  }
}
