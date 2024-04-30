package Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int transgression, int mind, int wit, int creativity) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wit = wit;
        this.creativity = creativity;
    }


    @Override
    public String toString() {
        return super.toString() + ", faculty='Ravenclaw', " +
                "mind=" + mind +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }

    @Override
    protected int sumOfAbility() {
        return mind + wit + creativity;
    }

    public void compareTo(Ravenclaw ravenclaw) {
        compareToStudent(ravenclaw);
    }
}
