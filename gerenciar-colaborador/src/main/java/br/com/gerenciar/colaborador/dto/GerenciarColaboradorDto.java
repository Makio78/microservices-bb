package br.com.gerenciar.colaborador.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GerenciarColaboradorDto {

    private Long id;
    private Long trilha_id;
    private Long colaborador_id;
    private String status;
}
