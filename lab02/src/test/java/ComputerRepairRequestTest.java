import org.example.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void testExample(){
        ComputerRepairRequest crr = new ComputerRepairRequest();
        assertEquals("", crr.getOwnerName());
        assertEquals("", crr.getOwnerAddress());
    }
}
