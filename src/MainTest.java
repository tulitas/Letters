import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() throws FileNotFoundException {
//        Main m = new Main();
        assertEquals(25, Main.getNum());
    }
}