package project;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args){
        String inputString = " Hello welcome to the brilworks ";
        String[] words = inputString.split(" ");

        String maxLengthWord = "";

        for (String word : words){
            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            }
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c: maxLengthWord.toCharArray() ) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        char maxCountChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxCountChar = entry.getKey();
            }
        }

        System.out.println("Max word: " + maxLengthWord);
        System.out.println("Unique character count: " + maxCountChar + "->" + maxCount);

    }
}
