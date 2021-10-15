package prototype;

public abstract class Pet {
    private String name;
    private String sound;

    public Pet(){};

    public Pet(Pet pet){
        if(pet != null){
            this.name = pet.name;
            this.sound = pet.sound;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract Pet clone();

}
