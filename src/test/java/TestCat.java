import mydomain.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class TestCat {
    @Test
    public void testSound(){
        Cat cat = new Cat("Барсик");
       // Assertions.assertEquals(cat.makeSound(), "мяу-мяу");
        Assertions.assertEquals("мяу-мяу", cat.makeSound());
    }
    @Test
    public void testConstruction(){
        Assertions.assertDoesNotThrow(() -> {
                                                Cat cat = new Cat("Барсик");
                                            });
    }
    @Test
    public void testConstruction2(){
        Cat cat = new Cat("Барсик");
        Assertions.assertEquals("Барсик", cat.getName());
    }
}
