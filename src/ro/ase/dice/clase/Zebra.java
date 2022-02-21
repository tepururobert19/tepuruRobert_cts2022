package ro.ase.dice.clase;

import ro.ase.dice.clase.Animal;

public class Zebra extends Animal {

    public Zebra(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {
        // TODO Auto-generated method stub
        System.out.print("Zebra "+this.getNume()+ " mananca "+ mancare);
    }

}

