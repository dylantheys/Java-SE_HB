package org.project.java.model;

public class Wolf extends Animal {
    public Wolf(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Wolf{");
        sb.append("health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
