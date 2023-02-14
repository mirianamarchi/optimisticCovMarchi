import static org.junit.Assert.assertEquals;

import it.marchimiriana.optimisticcoverage.ConvertInput;
import org.junit.Test;
public class TestConvertInput {
    String input = "1 6 7 5 4 3 30 2 8 9 0";
    int expected = 75;

    @Test
    public void test() {
        ConvertInput convert = new ConvertInput();
        int actual = convert.sumString(input);
        assertEquals(expected,actual);
    }
}

// OPTIMISTIC: Il test funziona correttamente, ma c'è un bug in quanto l'inserimento
// nella stringa di una lettera causa un'eccezione
