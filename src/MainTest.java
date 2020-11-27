import org.junit.jupiter.api.Test;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() throws IOException {
        String filePth = "C:/Users/service-user/IdeaProjects/Letters/src/resources/output.txt";
        assertEquals(filePth, Main.getFilePath());

    }


}