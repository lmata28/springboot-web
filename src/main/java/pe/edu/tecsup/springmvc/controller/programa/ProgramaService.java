package pe.edu.tecsup.springmvc.controller.programa;

import java.util.List;
import pe.edu.tecsup.springmvc.model.Curso;
import pe.edu.tecsup.springmvc.model.Programa;

public interface ProgramaService {

    List<Curso> allCurso();

    List<Programa> allPrograma();

    Programa find(Long id);

    void save(Programa programa);

    void delete(Long id);

}
