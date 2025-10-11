package org.example.structural.bridge.abstraction;

import org.example.structural.bridge.Point;
import org.example.structural.bridge.View;
import org.example.structural.bridge.implementation.WindowImp;

public abstract class Window {
    protected WindowImp imp;
    protected View contents;

    public Window(View contents) {
        this.contents = contents;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void drawContents();

    // Métodos padrão (podem ser sobrescritos)
    public void open() {
        // lógica padrão de abrir janela
    }

    public void close() {
        // lógica padrão de fechar janela
    }

    public void iconify() {
        // lógica padrão de minimizar janela
    }

    public void deiconify() {
        // lógica padrão de restaurar janela
    }

    // ---- Delegação para a implementação (Bridge) ----
    public void setOrigin(Point at) {
        if (imp != null) {
            imp.impSetOrigin(at);
        }
    }

    public void setExtent(Point extent) {
        if (imp != null) {
            imp.impSetExtent(extent);
        }
    }

    public void raise() {
        if (imp != null) {
            imp.impTop();
        }
    }

    public void lower() {
        if (imp != null) {
            imp.impBottom();
        }
    }

    /**
     * Desenha um retângulo na janela — método equivalente ao:
     * void Window::DrawRect(const Point& p1, const Point& p2)
     * do exemplo em C++
     */
    public void drawRect(Point p1, Point p2) {
        WindowImp imp = getWindowImp();
        if (imp != null) {
            imp.deviceRect(
                    p1.getX(), p1.getY(),
                    p2.getX(), p2.getY()
            );
        }
    }

    // ---- Getters auxiliares ----
    public View getView() {
        return contents;
    }

    public WindowImp getWindowImp() {
        return imp;
    }

    // ---- Setter opcional para a implementação (Bridge) ----
    public void setWindowImp(WindowImp imp) {
        this.imp = imp;
    }
}
