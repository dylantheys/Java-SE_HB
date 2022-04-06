package org.project.java;

import org.project.java.model.*;

import java.util.ArrayList;
import java.util.Collections;

public class MainEntry {

    public static void main(String[] args) {

        Rock rock1 = new Rock("Rocky", 12,5);

        House house1 = new House("Tavern", 12500, 5222,12, Ematerial.WOOD);

        Castle castle1 = new Castle("Castle", 12500, 5222,12, Ematerial.BRICK);

        Tree tree1 = new Tree("Oak", 12,5);
        tree1.setHealth(20);
        tree1.setResistance(5);
        tree1.setMaxHealth(20);

        Dragon dragon1 = new Dragon("Dragon", 588,15);
        dragon1.setHealth(5000);
        dragon1.setResistance(500);
        dragon1.setMaxHealth(5000);
        dragon1.setPower(1200);
        dragon1.setRange(500);

        Eagle eagle1 = new Eagle("Eagle", 588,15, 50);
        eagle1.setHealth(200);
        eagle1.setResistance(5);
        eagle1.setMaxHealth(200);

        Wolf wolf1 = new Wolf("Wolf", 588,15);
        wolf1.setHealth(200);
        wolf1.setMaxHealth(200);
        wolf1.setResistance(20);

        Human human1 = new Human("Human", 588,15,500);
        human1.setHealth(2000);
        human1.setMaxHealth(2000);
        human1.setResistance(120);

        Orc orc1 = new Orc("Orc", 588,15, 50);
        orc1.setHealth(200);
        orc1.setMaxHealth(200);
        orc1.setResistance(5);


        ArrayList<Being> units = new ArrayList<>();
        units.add(tree1);
        units.add(dragon1);
        units.add(eagle1);
        units.add(wolf1);
        units.add(human1);
        units.add(orc1);

        for (Being unit : units) {
            System.out.println(unit);
        }

        Collections.sort(units);
        System.out.println("\nSorted by health:");
        for (SpecialElement unit : units) {
            System.out.println(unit);
        }




    }
}
