package org.project.java.model;

public class Human extends Humanoid{
    public int mana;

    public Human(String name, int x, int y) {
        super(name, x, y);
    }

    public Human(String name, int x, int y, int mana) {
        super(name, x, y);
        this.mana = mana;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Human{");
        sb.append("health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", mana=").append(mana);
        sb.append(", animal=").append(animal);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
