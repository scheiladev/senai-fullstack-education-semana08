package br.com.senai.fullstack.senaifullstackeducationsemana08.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana08.model.AlunoModel;
import br.com.senai.fullstack.senaifullstackeducationsemana08.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

  private final AlunoService alunoService;

  public AlunoController(AlunoService alunoService) {
    this.alunoService = alunoService;
  }

  @GetMapping
  public List<AlunoModel> get() {
    return alunoService.buscarTodos();
  }

  @PostMapping
  public AlunoModel post(@RequestBody AlunoModel aluno) throws Exception {
    return alunoService.salvar(aluno);
  }
}
