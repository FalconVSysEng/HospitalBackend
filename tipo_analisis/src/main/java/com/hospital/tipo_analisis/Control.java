package com.hospital.tipo_analisis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/tipoanalisis")
public class Control {
  @Autowired
  private Services serv;

  @PostMapping("/grabar")
  public TipoAnalisis grabar(@RequestBody TipoAnalisis art) {
    return serv.grabar(art);
  }

  @GetMapping("/buscar/{id}")
  public TipoAnalisis buscar(@PathVariable Long id) {
    return serv.buscar(id);
  }

  @GetMapping("/listar")
  public List<TipoAnalisis> listar() {
    return serv.listar();
  }

  @PutMapping("/actualizar/{id}")
  public TipoAnalisis actualizar(@PathVariable Long id, @RequestBody TipoAnalisis art) {
    return serv.actualizar(id, art);
  }

  @DeleteMapping("/eliminar/{id}")
  public void eliminar(@PathVariable Long id) {
    serv.eliminar(id);
  }
}
