package hu.webler;

import hu.webler.domain.*;

public class BiologyApp {

    public static void main(String[] args) {

        LivingCreature emptyCarnivore  = new Carnivore();
        System.out.println(emptyCarnivore );
        int counter = getCreatureCounter ();
        System.out.println("Counter after empty carnivore: "+counter );
        emptyCarnivore.feed();
        System.out.println("-------------------" );

        Herbivore herbivore = new Herbivore("Rabbit", 2, new String [] {"White"},"Female");
        counter = getCreatureCounter ();
        System.out.println("Counter after herbivore: "+counter );
        System.out.println( herbivore );

        Omnivore bear = new Omnivore("Bear", 3, new String[] {"Brown"},"Male");
        counter = getCreatureCounter();
        System.out.println("Counter after bear: "+counter );
        System.out.println( bear );
        System.out.println("--------------");

        Carnivore lion = new Carnivore("Lion", 5, new String [] {"White,Brown"},"Male");
        System.out.println( lion );
        lion.feed();

        System.out.println("--------------");

        Animal ani= new Animal("AniCarni", 100, null, "xxx");
        System.out.println(ani);
        ani.feed();
    }

    private static int getCreatureCounter() {
     return (int) Math.ceil( Math.random() * 10 );
    }
}
