import java.util.HashMap;
import java.util.Map;

/**
 * A Decoder class that can decode encrypted messages.
 */
public class Decoder {

  /**
   * Decodes the given message {@param morse} that is encrypted in morsecode.
   *
   * @param morse The morsecode encrypted message.
   * @return The decrypted message as a {@code String}.
   */
  public String decodeMorse(String morse) {

    String message = "";
    String[] morseWords = morse.split("   ");

    for(String morseWord : morseWords) {
      String decodedWord = "";
      String[] morseLetters = morseWord.split(" ");
      for(String morseLetter : morseLetters) {
        if(!morseLetter.equals("")) {
          decodedWord += this.decodeMorseLetter(morseLetter);
        }
      }
      if(!message.equals("")) {
        message += " ";
      }
      message += decodedWord;
    }
    return message;
  }

  /**
   * Decodes the given morsecode letter.
   *
   * @param morseLetter The letter that is encrypted with morse code that is to be decoded.
   * @return The decoded morsecode letter in english as a {@code String}. If the given morseLetter
   *                        is not a recognized morsecode character returns {@code null}.
   */
  public String decodeMorseLetter(String morseLetter) {
    Map<String, String> morseMap = new HashMap();

    morseMap.put(".-", "a");
    morseMap.put("-...", "b");
    morseMap.put("-.-.", "c");
    morseMap.put("-..", "d");
    morseMap.put(".", "e");
    morseMap.put("..-.", "f");
    morseMap.put("--.", "g");
    morseMap.put("....", "h");
    morseMap.put("..", "i");
    morseMap.put(".---", "j");
    morseMap.put("-.-", "k");
    morseMap.put(".-..", "l");
    morseMap.put("--", "m");
    morseMap.put("-.", "n");
    morseMap.put("---", "o");
    morseMap.put(".--.", "p");
    morseMap.put("--.-", "q");
    morseMap.put(".-.", "r");
    morseMap.put("...", "s");
    morseMap.put("-", "t");
    morseMap.put("..-", "u");
    morseMap.put("...-", "v");
    morseMap.put(".--", "w");
    morseMap.put("-..-", "x");
    morseMap.put("-.--", "y");
    morseMap.put("--..", "z");
    morseMap.put("-----", "0");
    morseMap.put(".----", "1");
    morseMap.put("..---", "2");
    morseMap.put("...--", "3");
    morseMap.put("....-", "4");
    morseMap.put(".....", "5");
    morseMap.put("-....", "6");
    morseMap.put("--...", "7");
    morseMap.put("---..", "8");
    morseMap.put("----.", "9");
    morseMap.put(".-.-", ".");
    morseMap.put("--..--, ", "");

    return morseMap.get(morseLetter);
  }


}