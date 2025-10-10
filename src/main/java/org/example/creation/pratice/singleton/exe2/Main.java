package org.example.creation.pratice.singleton.exe2;

/*
⚙️ Ex 2 — Configuração global

Contexto:
Seu app precisa acessar variáveis de ambiente, credenciais e flags de debug.

Desafio:
Crie AppConfig Singleton com método get(String key).
Garanta que ele é carregado uma vez e compartilhado por toda a aplicação.

Vantagem:
Evita carregar configurações repetidamente e garante consistência global.
 */

public class Main {
    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        // Testando valores válidos
        config1.get("DB_URL");
        config1.get("DEBUG_MODE");

        // Testando chave inexistente
        config2.get("INVALID_KEY");

        // Verificando se são a mesma instância
        System.out.println("\nconfig1 == config2 ? " + (config1 == config2));
    }
}
