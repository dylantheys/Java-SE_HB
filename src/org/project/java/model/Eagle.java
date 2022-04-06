package org.project.java.model;

public class Eagle extends Animal{
    public int vision;

    public Eagle(String name, int x, int y) {
        super(name, x, y);
    }

    public Eagle(String name, int x, int y, int vision) {
        super(name, x, y);
        this.vision = vision;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Eagle{");
        sb.append("health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", vision=").append(vision);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
