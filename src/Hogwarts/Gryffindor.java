package Hogwarts;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

      @Override
    public String toString() {
        return super.toString() + ", faculty='Gryffindor', " +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }

    @Override
    protected int sumOfAbility() {
        return nobility + honor + bravery;
    }

    public void compareTo(Gryffindor gryffindor) {
        compareToStudent(gryffindor);
    }



}
