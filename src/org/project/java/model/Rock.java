package org.project.java.model;

public class Rock extends SpecialElement{

    public Rock(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rock{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}


