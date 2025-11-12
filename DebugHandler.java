// Handler responsável por processar mensagens do tipo DEBUG
public class DebugHandler extends LogHandler {
    @Override
    public void processarLog(LogMessage log) {
        if (log.getNivel().equalsIgnoreCase("DEBUG")) {
            System.out.println("[DEBUG] " + log.getMensagem());
        } else if (proximo != null) {
            // Caso o handler não seja responsável, passa adiante
            proximo.processarLog(log);
        }
    }
}
