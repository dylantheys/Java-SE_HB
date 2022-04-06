package org.project.java.model;

public class House extends SpecialElement{
    private int price;

    Ematerial material;
    House house;

    public House(String name, int price, int x, int y, Ematerial material) {
        super(name,x,y);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("price=").append(price);
        sb.append(", material=").append(material);
        sb.append(", house=").append(house);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
