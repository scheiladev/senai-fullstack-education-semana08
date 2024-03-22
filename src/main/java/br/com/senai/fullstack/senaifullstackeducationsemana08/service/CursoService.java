package br.com.senai.fullstack.senaifullstackeducationsemana08.service;

import br.com.senai.fullstack.senaifullstackeducationsemana08.model.AlunoModel;
import br.com.senai.fullstack.senaifullstackeducationsemana08.model.CursoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

  private final AlunoService alunoService;

  public CursoService(AlunoService alunoService) {
    this.alunoService = alunoService;
  }

  public List<CursoModel> buscarTodos() {
    return CursoModel.getListaCursos();
  }

  public CursoModel buscarPorId(Integer id) throws Exception {
    return CursoModel.buscarPorId(id);
  }

  public CursoModel salvar(CursoModel curso) throws Exception {
    if (validar(curso)) {
      return CursoModel.incluir(curso);
    }
    return null;
  }

  public CursoModel matricular(Integer cursoId, Integer alunoId) throws Exception {
    CursoModel curso = buscarPorId(cursoId);
    AlunoModel aluno = alunoService.buscarPorId(alunoId);
    CursoModel.matricular(curso, aluno);
    return curso;
  }

  private boolean validar(CursoModel curso) throws Exception {
    if (curso.getNome() == null || curso.getNome().isBlank()) {
      throw new Exception("Nome é obrigatório!");
    }

    if (curso.getCargaHoraria() == null) {
      throw new Exception("Carga horária é obrigatória!");
    }

    return true;
  }

}
