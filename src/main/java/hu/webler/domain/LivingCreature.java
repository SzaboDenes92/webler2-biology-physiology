package hu.webler.domain;

public abstract class  LivingCreature {

    public static int creatureCounter;
    private String name;
    private int age;
    private String[] colors;

    public LivingCreature() {
        this ("", 0, null); // Meghívja a másik konstruktort
    }

    public LivingCreature(String name, int age, String[] colors) {
        creatureCounter++;
        this.name=name;
        this.age=age;
        this.colors=colors;
    }

    // ez lehetne akár String visszatérés, de egyszerűsítés miatt most void
    // public abstract String feed(); // a típus / visszatérés az mindig igény függő....
    public abstract void feed();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getColors() {
        return colors;
    }

    public int getCreatureCounter() {
        return creatureCounter;
    }

    public void setName(String Name) {
        this.name=Name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public void setColors(String[] colors) {
        this.colors=colors;
    }

    public void setCreatureCounter(int num) {
        creatureCounter=num;
    }

    public abstract void move();

    public abstract void sleep();

    public String toString() {
        return "LivingCreature{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", colors'" + Arrays.toString (this.getColors ()) + '\'' +
                '}';
    }

    private class Arrays {
        public static String toString(String[] colors) {
            return "";
        }
    }
}