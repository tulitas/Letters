import org.junit.jupiter.api.Test;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void takeFile() throws IOException {
        String filePth = "C:/Users/user/IdeaProjects/Letters/src/resources/output.txt";
        assertEquals(filePth, Main.getFilePath());
    }

    @Test
    void takeLeters() {
        int lettersInFile = 0;
        int lettersInMain  = Main.getTotalLetters();
        assertEquals(lettersInFile, lettersInMain);
    }
}