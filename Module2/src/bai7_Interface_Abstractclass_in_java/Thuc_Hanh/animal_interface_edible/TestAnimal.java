package bai7_Interface_Abstractclass_in_java.Thuc_Hanh.animal_interface_edible;

import bai7_Interface_Abstractclass_in_java.Thuc_Hanh.animal_interface_edible.Chicken;
import bai7_Interface_Abstractclass_in_java.Thuc_Hanh.animal_interface_edible.Tiger;

public class TestAnimal {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();
        System.out.println(tiger.makeSound());
        System.out.println(chicken.howToEat());
        System.out.println(chicken.makeSound());
        Apple apple = new Apple();
        System.out.println(apple.howToEat());
        Orange orange = new Orange();
        System.out.println(orange.howToEat());
    }
}
