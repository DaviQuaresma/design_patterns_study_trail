package org.example.creation.pratice.builder.exe2.components;

public class Footer {
    private final String content;

    public Footer(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content;
    }
}
