package org.example.structural.pratice.facade.exercise2.subSystems;

public class Uploader {

    public String upload(String file, String ext) {
        String fullFile = file + "." + ext;
        System.out.println("Uploading file " + fullFile);
        return fullFile;
    }
}
