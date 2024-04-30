package Hogwarts;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int parity;

    public Hufflepuff(String name, int magic, int transgression, int hardWork, int loyalty, int parity) {
        super(name, magic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.parity = parity;
    }


    @Override
    public String toString() {
        return super.toString() + ", faculty='Hufflepuff', " +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", parity=" + parity;
    }

    @Override
    protected int sumOfAbility() {
        return hardWork + loyalty + parity;
    }

    public void compareTo(Hufflepuff hufflepuff) {
        compareToStudent(hufflepuff);
    }
}
