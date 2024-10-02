import mydomain.Hence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHence {
    @Test
    public void testSound(){
        Hence h = new Hence("Марта");
        Assertions.assertEquals("ко-ко-ко", h.makeSound());
    }
}
