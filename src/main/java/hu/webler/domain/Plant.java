package hu.webler.domain;

public class Plant extends LivingCreature {

    public Plant() {

    }

    public Plant(String name, int age, String[] colors ) {

    }


    @Override
    public void feed(){

    }

    @Override
    public void move(){
        System.out.println ("Plants don't move");
    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + super.getName () + '\'' +
                ", age='" + super.getAge () + '\'' +
                ", colors'" + super.getColors ().toString () + '\'' +
                '}';
    }

}
