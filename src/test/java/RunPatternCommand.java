import  com.rp.pattern.command.Client;
import org.junit.jupiter.api.Test;

public class RunPatternCommand {

    @Test
    public void testCommandPattern(){
        Client client = new Client();
        client.assemble();
    }
}
