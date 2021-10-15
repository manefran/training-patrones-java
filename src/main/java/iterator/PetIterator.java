package iterator;

import java.util.Iterator;

public class PetIterator implements Iterator<Pet> {
    private Pet[] pets;
    int position;

    public PetIterator(Pet[] pets){
        this.pets = pets;
    }

    @Override
    public boolean hasNext() {
        return position < pets.length;
    }

    @Override
    public Pet next() {
        return pets[position++];
    }

}
