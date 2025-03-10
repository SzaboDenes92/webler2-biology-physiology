package hu.webler.domain;

public class Human extends LivingCreature implements HumanActivity{
    private String gender;
    public Human() {

    }


    public Human (String name, int age, String[] colors,  String gender) {
        super( name, age, colors );
        this.gender  = gender;
    }
     @Override
    public void feed() {
        System.out.println( "Human is being  fed. Yum yum yum. " );
     }

    @Override
    public void move() {

    }

    @Override
     public void think() {
        System.out.println( "Human is thinking!" );
     }
     @Override
     public void speak() {
        System.out.println( "Human is speaking!" );
     }

     @Override
     public void sleep() {
        System.out.println( "Human is sleeping at night!" );
     }

    public String getGender() {
        return gender;
    }
    public String setGender() {
        this.gender = gender;
        return "";
    }

    @Override
    public String toString() {
        return "Human";
    }
}
