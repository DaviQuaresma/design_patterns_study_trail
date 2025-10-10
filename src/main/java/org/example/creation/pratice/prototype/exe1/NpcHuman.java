package org.example.creation.pratice.prototype.exe1;

public class NpcHuman implements NpcPrototype {
    private String name;
    private int life;
    private String clothes;

    public NpcHuman(String name, int life, String clothes) {
        this.name = name;
        this.life = life;
        this.clothes = clothes;
    }

    @Override
    public NpcPrototype clonar() {
        // Retorna uma cópia do objeto atual
        return new NpcHuman(this.name, this.life, this.clothes);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void set(int life) {
        this.life = life;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "NPC {" +
                "name=" + name + '\'' +
                ", life=" + life + '\'' +
                ", clothes=" + clothes +
                '}';
    }
}
