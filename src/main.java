public class main {
  public static void main(String[] args) {
    Decoder decoder = new Decoder();
    //Should print "Hey Jude"
    System.out.println(decoder.decodeMorse(".... . -.--   .--- ..- -.. ."));
  }
}
