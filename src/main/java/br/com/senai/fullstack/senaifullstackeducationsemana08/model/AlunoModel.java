package br.com.senai.fullstack.senaifullstackeducationsemana08.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class AlunoModel {

  private static Integer proximoId = 1;

  @Setter(AccessLevel.NONE) private Integer id;
  private String nome;
  private LocalDate dataNascimento;

  private Integer getProximoId() {
    return proximoId++;
  }


}
