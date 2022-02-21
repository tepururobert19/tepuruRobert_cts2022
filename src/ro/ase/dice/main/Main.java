package ro.ase.dice.main;

import ro.ase.dice.clase.Elefant;
import ro.ase.dice.clase.IngrijitorZOO;
import ro.ase.dice.clase.ZOO;
import ro.ase.dice.clase.Zebra;

public class Main {
    public static void main(String[] args) {

        IngrijitorZOO ingrijitor = new IngrijitorZOO("Marius");

        Zebra z1 = new Zebra("Elena");
        Zebra z2 = new Zebra("Alexandru");
        Elefant e1 = new Elefant("Alexandra");
        Elefant e2 = new Elefant("Dada");

        ZOO zoo = new ZOO("Bucuresti ZOO", ingrijitor);

        zoo.adaugaAnimal(z1);
        zoo.adaugaAnimal(z2);
        zoo.adaugaAnimal(e1);
        zoo.adaugaAnimal(e2);


    }
}
