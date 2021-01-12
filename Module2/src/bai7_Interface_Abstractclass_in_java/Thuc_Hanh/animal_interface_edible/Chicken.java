package bai7_Interface_Abstractclass_in_java.Thuc_Hanh.animal_interface_edible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "gà nướng";
    }
}
