package br.com.gerenciar.colaborador.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "gerenciar_colaborador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GerenciarColaborador {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private Long trilha_id;

    @NonNull
    private Long colaborador_id;

    @Enumerated(EnumType.STRING)
    private Status status;

}
