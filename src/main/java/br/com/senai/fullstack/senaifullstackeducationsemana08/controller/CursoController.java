package br.com.senai.fullstack.senaifullstackeducationsemana08.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana08.model.AlunoModel;
import br.com.senai.fullstack.senaifullstackeducationsemana08.model.CursoModel;
import br.com.senai.fullstack.senaifullstackeducationsemana08.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {

  private final CursoService cursoService;

  public CursoController(CursoService cursoService) {
    this.cursoService = cursoService;
  }

  @GetMapping
  public List<CursoModel> get()  {
    return cursoService.buscarTodos();
  }

  @PostMapping
  public CursoModel post(@RequestBody CursoModel curso) throws Exception {
    return cursoService.salvar(curso);
  }

@PostMapping("{id}/matricular-aluno")
  public CursoModel post(@PathVariable Integer id, @RequestBody AlunoModel aluno) throws Exception {
    return cursoService.matricular(id, aluno.getId());
  }
}
