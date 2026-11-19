package lab8;

import java.util.HashMap;
import java.util.Map;

public class Wordcounter {

    private final Map<String, Integer> wordMap = new HashMap<String, Integer>();


    public void addWord(String word) {

        int count =1;

        if (wordMap.containsKey(word)) {
            count = wordMap.get(word) + 1;

            wordMap.put(word, count + 1);
        }

        }
    }












