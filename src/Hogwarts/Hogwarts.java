package Hogwarts;

public abstract class Hogwarts {
    private String name;
    private int magic;
    private int transgression;


    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public void printStudent() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magic=" + magic +
                ", apparate=" + transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    private int sumOfBaseAbility() {
        return magic + transgression;
    }

    public void compareToHogwartsStudent(Hogwarts hogwarts) {
        if (this.sumOfBaseAbility() > hogwarts.sumOfBaseAbility()) {
            System.out.printf("Студент %s лучше студента %s, т.к. у него больше очков характеристик (%d против %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    this.sumOfBaseAbility(),
                    hogwarts.sumOfBaseAbility());
        } else if (this.sumOfBaseAbility() < hogwarts.sumOfBaseAbility()) {
            System.out.printf("Студент %s лучше студента %s, т.к. у него больше очков характеристик (%d против %d)%n",
                    hogwarts.getName(),
                    this.getName(),
                    hogwarts.sumOfBaseAbility(),
                    this.sumOfBaseAbility());
        } else {
            System.out.printf("Студент %s равен студенту %s, т.к. у них одинаковые характеристики (%d против %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    this.sumOfBaseAbility(),
                    hogwarts.sumOfBaseAbility());
        }

    }

    protected abstract int sumOfAbility();

    protected void compareToStudent(Hogwarts hogwarts) {
        if (this.sumOfBaseAbility() > hogwarts.sumOfAbility()) {
            System.out.printf("Студент %s лучше студента %s, т.к. у него больше очков характеристик (%d против %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    this.sumOfAbility(),
                    hogwarts.sumOfAbility());
        } else if (this.sumOfAbility() < hogwarts.sumOfAbility()) {
            System.out.printf("Студент %s лучше студента %s, т.к. у него больше очков характеристик (%d против %d)%n",
                    hogwarts.getName(),
                    this.getName(),
                    hogwarts.sumOfAbility(),
                    this.sumOfAbility());
        } else {
            System.out.printf("Студент %s равен студенту %s, т.к. у них одинаковые характеристики (%d против %d)%n",
                    this.getName(),
                    hogwarts.getName(),
                    this.sumOfAbility(),
                    hogwarts.sumOfAbility());
        }

    }
}





