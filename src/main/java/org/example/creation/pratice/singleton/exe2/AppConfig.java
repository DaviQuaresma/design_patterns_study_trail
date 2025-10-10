package org.example.creation.pratice.singleton.exe2;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private static AppConfig instance;

    // Armazena todas as configurações globais
    private Map<String, String> configs;

    // Construtor privado
    private AppConfig() {
        configs = new HashMap<>();

        // Simulando o carregamento de configs do sistema, .env, ou arquivo externo
        configs.put("DB_URL", "jdbc:mysql://localhost:3306/erpdb");
        configs.put("DB_USER", "admin");
        configs.put("DB_PASS", "123456");
        configs.put("DEBUG_MODE", "true");
        configs.put("API_KEY", "MVQ9NEVE91VHD");
    }

    // Retorna a instância única
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    // Busca valor da configuração
    public String get(String key) {
        String value = configs.get(key);
        if (value == null) {
            System.out.println("Configuração não encontrada: " + key);
            return null;
        }
        System.out.println("key: " + key + " = " + value);
        return value;
    }
}
