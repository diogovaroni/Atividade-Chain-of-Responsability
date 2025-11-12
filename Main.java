// Classe principal que configura e testa a cadeia de responsabilidade
public class Main {
    public static void main(String[] args) {
        // Criação dos handlers
        DebugHandler debug = new DebugHandler();
        InfoHandler info = new InfoHandler();
        WarningHandler warning = new WarningHandler();
        ErrorHandler error = new ErrorHandler();

        // Montagem da cadeia: DEBUG → INFO → WARNING → ERROR
        debug.setProximo(info);
        info.setProximo(warning);
        warning.setProximo(error);

        // Criação de mensagens de log com diferentes níveis
        LogMessage log1 = new LogMessage("DEBUG", "Mensagem de depuração.");
        LogMessage log2 = new LogMessage("INFO", "Usuário logado com sucesso.");
        LogMessage log3 = new LogMessage("WARNING", "Uso de memória acima do esperado.");
        LogMessage log4 = new LogMessage("ERROR", "Falha ao conectar ao banco de dados.");

        // Processamento dos logs
        debug.processarLog(log1);
        debug.processarLog(log2);
        debug.processarLog(log3);
        debug.processarLog(log4);

        // Exibir logs INFO armazenados
        info.mostrarLogs();
    }
}

