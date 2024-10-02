package mydomain;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Pet[] makeArrayOf3(){
        Pet[] pets = {new Cat("Мурзик"), new Hence("Приллан"), new Cat("Бася")};
        return pets;
    }

    public static String[] convertPetsToSounds(Pet[] pets){
        String[] massiv = new String[pets.length];
        for (int i = 0; i < pets.length; i++) {
            massiv[i] = pets[i].makeSound();
        }
        return massiv;
    }
}