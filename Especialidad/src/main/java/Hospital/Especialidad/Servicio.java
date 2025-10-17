package Hospital.Especialidad;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    @Autowired
    private Repositorio repo;
    
    public Especialidad grabar(Especialidad esp){
        return repo.save(esp);
    }
    
    public Especialidad buscar(Long id){
        return repo.findById(id).orElse(null);
    }
    
    public List<Especialidad>listar(){
        return repo.findAll();
    }
    
    public Especialidad actualizar(Long id,Especialidad art){
        return repo.findById(id).map(existing->{
            existing.setNombre(art.getNombre());
            return repo.save(existing);
        }).orElse(null);
    }
    
    public void eliminar(Long id){
        repo.deleteById(id);
    }
}
