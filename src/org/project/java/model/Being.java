package org.project.java.model;

public abstract class Being extends SpecialElement implements Comparable<Being> {
    private int maxHealth = 100;
    protected int health;
    protected double resistance;

    public Being(String name, int x, int y) {
        super(name, x, y);
    }


    public int receiveDamage(int damage) {
        health -= damage;
        return health;
    }

    @Override
    public int compareTo(Being o) {
        if (this.health > o.health) {
            return -1;
        } else if (this.health < o.health) {
                return 1;
            } else {
                return 0;
            }
        }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}

