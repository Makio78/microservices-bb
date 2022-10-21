package br.com.gerenciar.colaborador.controller;

import br.com.gerenciar.colaborador.dto.GerenciarColaboradorDto;
import br.com.gerenciar.colaborador.service.GerenciarControladorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/gerenciar_trilhas")
public class GerenciarColaboradorController {

    @Autowired
    private GerenciarControladorService service;

    @GetMapping
    public Page<GerenciarColaboradorDto> listar(@PageableDefault(size = 10) Pageable paginacao) {
        return service.obterTodos(paginacao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GerenciarColaboradorDto> detalhar(@PathVariable @NotNull Long id) {
        GerenciarColaboradorDto dto = service.obterPorId(id);

        return ResponseEntity.ok(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GerenciarColaboradorDto> atualizar(@PathVariable @NotNull Long id, @RequestBody @Valid GerenciarColaboradorDto dto) {
        GerenciarColaboradorDto atualizado = service.atualizarTrilha(id, dto);
        return ResponseEntity.ok(atualizado);
    }


}
