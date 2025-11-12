import java.util.ArrayList;
import java.util.List;

// Handler responsável por processar mensagens do tipo INFO
public class InfoHandler extends LogHandler {
    private List<LogMessage> logsInfo = new ArrayList<>();

    @Override
    public void processarLog(LogMessage log) {
        if (log.getNivel().equalsIgnoreCase("INFO")) {
            logsInfo.add(log);
            System.out.println("[INFO] Log armazenado: " + log.getMensagem());
        } else if (proximo != null) {
            proximo.processarLog(log);
        }
    }

    // Método auxiliar para visualizar logs armazenados
    public void mostrarLogs() {
        System.out.println("\n--- Logs INFO armazenados ---");
        for (LogMessage log : logsInfo) {
            System.out.println(log.getData() + " - " + log.getMensagem());
        }
    }
}

