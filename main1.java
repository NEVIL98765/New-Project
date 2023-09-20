package project;

public class main1 {
    public static void main(String[] args){
        String inputString = " Hello welcome to the brilworks ";
        String[] words = inputString.split(" ");

        String maxLengthWord = "";

        for (String word : words){
            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            }
        }

        System.out.println(" The maximum word is: " + maxLengthWord);
    }
}
