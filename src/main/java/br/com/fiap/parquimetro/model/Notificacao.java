package br.com.fiap.parquimetro.model;

import br.com.fiap.parquimetro.model.enums.NotificaoStatus;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notificacao {
    @Id
    private String id;

    private String mensagem;

    private Cliente cliente;

    private LocalDateTime dateTime;

    private NotificaoStatus status;
}
