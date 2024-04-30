package Hogwarts;

public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magic, int transgression, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    @Override
    public String toString() {
        return super.toString() + ", faculty='Slytherin', " +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }

    @Override
    protected int sumOfAbility() {
        return trick + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareTo(Slytherin slytherin) {
        compareToStudent(slytherin);
    }
}
