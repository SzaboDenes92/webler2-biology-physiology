package hu.webler.domain;

public class Animal extends LivingCreature implements AnimalActivity{

    private String gender;

    public Animal() {

    }

    public Animal (String name, int age, String[] colors, String gender) {
        super(name, age, colors);
        this.gender = gender;
    }

    @Override
    public void feed() {
        System.out.println("Animal is being fed. Yum yum yum. Animal food!");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal sound!");
    }

    @Override
    public void move() {
        System.out.println("Animal can move!");
    }

    @Override
    public void sleep() {
        System.out.println("Animal sleep!");
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
               "gender='" + gender + '\'' +
                "} " + super.toString();

    }
 }
