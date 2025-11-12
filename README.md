# 🪵 Sistema de Processamento de Logs com Chain of Responsibility

## 🎯 Objetivo
Este projeto demonstra o uso do **padrão Chain of Responsibility** para criar um sistema de processamento de logs, onde diferentes níveis de severidade são tratados por handlers específicos em uma cadeia de responsabilidade.

---

## 🧠 Conceito do Padrão
O **Chain of Responsibility** permite que múltiplos objetos processem uma solicitação em sequência.  
Cada objeto (handler) decide se processa a requisição ou a repassa ao próximo da cadeia.

Neste sistema:
- Cada **handler** representa um nível de log (`DEBUG`, `INFO`, `WARNING`, `ERROR`).
- A requisição (mensagem de log) percorre a cadeia até encontrar o handler adequado.

---

## 🏗️ Estrutura do Projeto
```
src/
 ├── LogMessage.java
 ├── LogHandler.java
 ├── DebugHandler.java
 ├── InfoHandler.java
 ├── WarningHandler.java
 ├── ErrorHandler.java
 └── Main.java
```
