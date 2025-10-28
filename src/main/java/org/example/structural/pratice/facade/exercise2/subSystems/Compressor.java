package org.example.structural.pratice.facade.exercise2.subSystems;

public class Compressor {

    public String compressArchive(String fullFile) {
        System.out.println("Compressão do arquivo: " + fullFile);
        String compressedFile = fullFile + ".zip";
        return compressedFile;
    }
}
