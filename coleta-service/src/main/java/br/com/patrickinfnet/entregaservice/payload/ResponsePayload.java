package br.com.patrickinfnet.entregaservice.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class ResponsePayload {
    private String message;
    private LocalDateTime dateTime;
}
