package br.com.senai.fullstack.senaifullstackeducationsemana08.service;

import br.com.senai.fullstack.senaifullstackeducationsemana08.model.AlunoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

  public List<AlunoModel> buscarTodos() {
    return AlunoModel.getListaAlunos();
  }

  public AlunoModel salvar(AlunoModel aluno) {
    if (validar(aluno)) {
      return AlunoModel.incluir(aluno);
    }
    return null;
  }

  private boolean validar(AlunoModel aluno) throws Exception {
    if (aluno.getNome() == null || aluno.getNome().isBlank()) {
      throw new Exception("Nome é obrigatório!");
    }

    if (aluno.getDataNascimento() == null) {
      throw new Exception("Data de nascimento é obrigatória!");
    }

    return true;
  }

}
