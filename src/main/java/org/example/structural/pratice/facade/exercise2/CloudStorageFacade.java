package org.example.structural.pratice.facade.exercise2;

import org.example.structural.pratice.facade.exercise2.subSystems.AuthService;
import org.example.structural.pratice.facade.exercise2.subSystems.Compressor;
import org.example.structural.pratice.facade.exercise2.subSystems.Uploader;

public class CloudStorageFacade {
    private final AuthService authService;
    private final Compressor compressor;
    private final Uploader uploader;

    public CloudStorageFacade() {
        authService = new AuthService();
        compressor = new Compressor();
        uploader = new Uploader();
    }

    public String finalUpload(String username, String password, String file, String ext) {
        System.out.println("=== Iniciando upload ===");
        boolean auth = authService.authenticate(username, password);

        if (!auth) {
            System.out.println("Acesso negado");
            return null;
        }

        String compressed = compressor.compressArchive(uploader.upload(file, ext));

        System.out.println("=== Upload concluído ===");
        return compressed;
    }
}
