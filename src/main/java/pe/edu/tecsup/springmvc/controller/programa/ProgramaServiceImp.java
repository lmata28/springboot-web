package pe.edu.tecsup.springmvc.controller.programa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.tecsup.springmvc.dao.CursoDAO;
import pe.edu.tecsup.springmvc.dao.ProgramaDAO;
import pe.edu.tecsup.springmvc.model.Curso;
import pe.edu.tecsup.springmvc.model.Programa;

@Service
@Transactional
public class ProgramaServiceImp implements ProgramaService {

    @Autowired
    CursoDAO cursoDAO;

    @Autowired
    ProgramaDAO programaDAO;

    @Override
    public List<Curso> allCurso() {
        return cursoDAO.list();
    }

    @Override
    public List<Programa> allPrograma() {
        return programaDAO.list();
    }

    @Override
    public Programa find(Long id) {
        return programaDAO.get(id);
    }

    @Override
    public void save(Programa programa) {
        if (programa.getId() == null) {
            programaDAO.save(programa);
        } else {
            programaDAO.update(programa);
        }
    }

    @Override
    public void delete(Long id) {       
        programaDAO.delete(new Programa(id));
    }

}
