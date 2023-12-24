package br.com.patrickinfnet.entregaservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data@NoArgsConstructor@AllArgsConstructor@Builder
@Entity
public class Coleta {
    @Id
    private int id;
    private String descricao;
    private LocalDateTime data;
    private boolean pendente;
    private int coletausuarioid;
    private int coletasolicitanteid;
}
