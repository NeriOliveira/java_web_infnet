package br.com.patrickinfnet.entregaservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data@NoArgsConstructor@AllArgsConstructor@Builder
public class Coleta {
    private int id;
    private String descricao;
    private LocalDateTime data;
    private boolean pendente;
    private int coletausuarioid;
    private int coletasolicitanteid;
}
