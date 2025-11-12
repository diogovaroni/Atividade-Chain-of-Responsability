// Classe abstrata que define o comportamento de um manipulador de log
public abstract class LogHandler {
    protected LogHandler proximo; // Próximo handler na cadeia

    public void setProximo(LogHandler proximo) {
        this.proximo = proximo;
    }

    // Método que cada handler concreto deverá implementar
    public abstract void processarLog(LogMessage log);
}
