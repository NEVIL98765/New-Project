package project;

import java.util.HashMap;
import java.util.Map;

public class brilworks {
    public static void main(String[] args){
        String maxWord = "brilworkss";

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c: maxWord.toCharArray() ) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        char maxCountChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
             if (entry.getValue() > maxCount){
                 maxCount = entry.getValue();
                 maxCountChar = entry.getKey();
             }
        }

        System.out.println(" Max word: " + maxWord);
        System.out.println("Unique character count: " + maxCountChar + " ->" + maxCount);
    }
}
