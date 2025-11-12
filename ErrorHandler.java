// Handler responsável por processar mensagens do tipo ERROR
public class ErrorHandler extends LogHandler {
    @Override
    public void processarLog(LogMessage log) {
        if (log.getNivel().equalsIgnoreCase("ERROR")) {
            System.out.println("[ERRO] Notificação enviada (simulada): " + log.getMensagem());
        } else if (proximo != null) {
            proximo.processarLog(log);
        }
    }
}


