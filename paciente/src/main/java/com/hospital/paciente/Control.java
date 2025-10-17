package com.hospital.paciente;

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
@RequestMapping("/paciente")
public class Control {
  @Autowired
  private Services serv;

  @PostMapping("/grabar")
  public Paciente grabar(@RequestBody Paciente art) {
    return serv.grabar(art);
  }

  @GetMapping("/buscar/{id}")
  public Paciente buscar(@PathVariable Long id) {
    return serv.buscar(id);
  }

  @GetMapping("/listar")
  public List<Paciente> listar() {
    return serv.listar();
  }

  @PutMapping("/actualizar/{id}")
  public Paciente actualizar(@PathVariable Long id, @RequestBody Paciente art) {
    return serv.actualizar(id, art);
  }

  @DeleteMapping("/eliminar/{id}")
  public void eliminar(@PathVariable Long id) {
    serv.eliminar(id);
  }

}
