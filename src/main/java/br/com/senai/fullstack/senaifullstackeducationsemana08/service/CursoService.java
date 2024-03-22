package br.com.senai.fullstack.senaifullstackeducationsemana08.service;

import br.com.senai.fullstack.senaifullstackeducationsemana08.model.CursoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

  public List<CursoModel> buscarTodos() {
    return CursoModel.getListaCursos();
  }

  public CursoModel salvar(CursoModel curso) throws Exception {
    if (validar(curso)) {
      return CursoModel.incluir(curso);
    }
    return null;
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
