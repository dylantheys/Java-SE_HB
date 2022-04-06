package org.project.java.model;

public class Dragon extends Animal {
    private int power;
    private int range;
    public Dragon(String name, int x, int y) {
        super(name, x, y);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dragon{");
        sb.append("health=").append(health);
        sb.append(", resistance=").append(resistance);
        sb.append(", power=").append(power);
        sb.append(", range=").append(range);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
