package org.example.creation.pratice.singleton.exe1;

import java.time.LocalDateTime;

public class Logger {
    // instância única estática
    private static Logger instance;

    // construtor privado (impede new Logger())
    private Logger() {
        System.out.println("Logger iniciado...");
    }

    // ponto de acesso global
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg){
        System.out.println(LocalDateTime.now() + " | " + msg);
    }
}
