// Handler responsável por processar mensagens do tipo WARNING
public class WarningHandler extends LogHandler {
    @Override
    public void processarLog(LogMessage log) {
        if (log.getNivel().equalsIgnoreCase("WARNING")) {
            System.out.println("[WARNING] Log gravado (simulado): " + log.getMensagem());
        } else if (proximo != null) {
            proximo.processarLog(log);
        }
    }
}


