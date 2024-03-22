package br.com.senai.fullstack.senaifullstackeducationsemana08.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class CursoModel {

  private static Integer proximoId = 1;
  @Getter private static List<CursoModel> listaCursos = new ArrayList<>();

  @Setter(AccessLevel.NONE) private Integer id;
  private String nome;
  private String descricao;
  private Integer cargaHoraria;
  private List<AlunoModel> alunosCurso = new ArrayList<>();

  private static Integer getProximoId() {
    return proximoId++;
  }

  public static CursoModel incluir(CursoModel curso) {
    curso.id = getProximoId();
    listaCursos.add(curso);
    return curso;
  }

  public static CursoModel buscarPorId(Integer id) throws Exception {
    for (CursoModel curso : listaCursos) {
      if (curso.getId().equals(id)) {
        return curso;
      }
    }
    throw new Exception("Aluno não encontrado!");
  }

  public static void matricular(CursoModel curso, AlunoModel aluno) {
    curso.getAlunosCurso().add(aluno);
  }

}
