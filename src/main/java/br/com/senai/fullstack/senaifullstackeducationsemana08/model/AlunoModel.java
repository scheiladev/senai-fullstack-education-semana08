package br.com.senai.fullstack.senaifullstackeducationsemana08.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class AlunoModel {

  private static Integer proximoId = 1;
  @Getter private static List<AlunoModel> listaAlunos = new ArrayList<>();

  @Setter(AccessLevel.NONE) private Integer id;
  private String nome;
  private LocalDate dataNascimento;

  private static Integer getProximoId() {
    return proximoId++;
  }

  public static AlunoModel incluir(AlunoModel aluno) {
        aluno.id = getProximoId();
        listaAlunos.add(aluno);
        return aluno;
  }

  public static AlunoModel buscarPorId(Integer id) throws Exception {
    for (AlunoModel aluno : listaAlunos) {
      if (aluno.getId().equals(id)) {
        return aluno;
      }
    }
    throw new Exception("Aluno não encontrado!");
  }


}
