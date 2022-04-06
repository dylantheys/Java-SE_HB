package org.project.java.model;

public class Castle extends House{
    private int defense;

    public Castle(String name, int price, int x, int y, Ematerial material) {
        super(name, price, x, y, material);
    }


    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Castle{");
        sb.append("defense=").append(defense);
        sb.append(", material=").append(material);
        sb.append(", house=").append(house);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
