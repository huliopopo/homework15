import Hogwarts.Gryffindor;
import Hogwarts.Hufflepuff;
import Hogwarts.Ravenclaw;
import Hogwarts.Slytherin;

public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Harry Potter", 50, 45, 25, 54, 46);
        Gryffindor hermione = new Gryffindor("Hermione Granger", 100, 52, 45, 78, 37);
        Gryffindor ron = new Gryffindor("Ronald Weasley", 10, 45, 47, 35, 12);

        Hufflepuff zacharias = new Hufflepuff("Zacharias Smith", 25, 45, 23, 26, 33);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 47, 86, 89, 54, 10);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 75, 25, 25, 46, 12);

        Ravenclaw cho = new Ravenclaw("Cho Chang", 45, 84, 65, 12, 57);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 24, 36, 56, 24, 65);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 98, 63, 23, 74, 65);

        Slytherin draco = new Slytherin("Draco Malfoy", 85, 75, 80, 43, 95, 76, 100);
        Slytherin graham = new Slytherin("Graham Montague", 66, 33, 44, 22, 11, 88, 77);
        Slytherin gregory = new Slytherin("Gregory Goyle", 1, 94, 3, 4, 5, 6, 0);

        harry.printStudent();
        zacharias.printStudent();
        cho.printStudent();
        draco.printStudent();

        System.out.println();
        harry.compareTo(hermione);
        cedric.compareTo(justin);
        padma.compareTo(marcus);
        graham.compareTo(gregory);

        System.out.println();
        harry.compareToHogwartsStudent(zacharias);

        System.out.println();
        harry.compareTo(ron);


    }

}