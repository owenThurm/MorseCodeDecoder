import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class DecoderTests {

    Decoder decoder = new Decoder();

    @Test
    public void testExample() {
      assertThat(decoder.decodeMorse(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }

    @Test
    public void testExample2() {
      assertThat(decoder.decodeMorse(".-   .... .- .--. .--. -.--   --. ..- -.--"), is("A HAPPY GUY"));
    }
}
