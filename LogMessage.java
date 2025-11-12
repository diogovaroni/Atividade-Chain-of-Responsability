import java.time.LocalDateTime;

// Classe que representa uma mensagem de log
public class LogMessage {
    private String nivel;       // Nível do log (DEBUG, INFO, WARNING, ERROR)
    private String mensagem;    // Texto da mensagem
    private LocalDateTime data; // Data e hora da criação do log

    public LogMessage(String nivel, String mensagem) {
        this.nivel = nivel;
        this.mensagem = mensagem;
        this.data = LocalDateTime.now();
    }

    public String getNivel() {
        return nivel;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }
}

