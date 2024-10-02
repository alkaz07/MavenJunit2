import mydomain.Cat;
import mydomain.Hence;
import mydomain.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mydomain.Main;

public class TestMain {
    @Test
    public void testMakeArrayOf3(){
        Pet[] pets = Main.makeArrayOf3();
        Assertions.assertEquals(3, pets.length);
        Pet[] expected = {new Cat("Мурзик"), new Hence("Приллан"), new Cat("Бася")};
        //Таким ассертом можно пользоваться, ТОЛЬКО если у классов элементов массива переопределен метод equals
        Assertions.assertArrayEquals(expected, pets);
    }

    @Test
    public void testConvert(){
        Pet[] pets = Main.makeArrayOf3();
        String[] sounds = Main.convertPetsToSounds(pets);
        String[] expected = {"мяу-мяу", "ко-ко-ко", "мяу-мяу"};
        Assertions.assertArrayEquals(expected, sounds);
    }

    //А надо еще проверить в разных комбинациях массивы зверей и звуки

}
