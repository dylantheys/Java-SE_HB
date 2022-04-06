package org.project.java.model;

public class Orc extends Humanoid{
    public int rage;

    public Orc(String name, int x, int y) {
        super(name, x, y);
    }

    public Orc(String name, int x, int y, int rage) {
        super(name, x, y);
        this.rage = rage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Orc{");
        sb.append("health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", animal=").append(animal);
        sb.append(", rage=").append(rage);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
