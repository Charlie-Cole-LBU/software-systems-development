import java.util.*;

public class StringProcessor implements CounterTypes {

    @Override
    public int countWords(String sentence) {

        String [] word = sentence.split(" ");

        return word.length;

    }

    @Override
    public int countLetters(String sentence) {

        return 0;
    }

    @Override
    public int getLength(String sentence) {

        return sentence.length();

    }

}
