package com.oop.lab3;

import java.util.*;
import java.util.stream.Stream;

public class TextManipulation {
    String text;

    public TextManipulation(String text){
        this.text = text;
    }

    public int countWords(){
        String[] words = text.split("\\s");

        return words.length;
    }

    public int countSentences(){
        int sentencesCount = 0;

        for(int i = 0; i < text.length(); i++){
            char character = text.charAt(i);

            if(character == '.'){
                sentencesCount += 1;
            }
        }

        return sentencesCount;
    }

    public LettersInfo lettersInfo(){
        Character[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};
        List<Character> vowelsList = new ArrayList<>(Arrays.asList(vowelsArray));

        int vowelsCount = 0;
        int consonantsCount = 0;
        int lettersCount = 0;

        for(int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);

            if(!Character.isLetter(letter)){
                continue;
            }

            if(vowelsList.contains((letter))){
                vowelsCount += 1;
            }else{
                consonantsCount += 1;
            }

            lettersCount += 1;
        }

        return new LettersInfo(lettersCount, vowelsCount, consonantsCount);
    }

    public void printFrequentWords(){
        String[] words = text.split("\\s");
        HashMap<String,Integer> wordsHMap = new HashMap<>();

        for(String word : words){
            if(wordsHMap.containsKey(word)) {
                int count = wordsHMap.get(word);
                wordsHMap.put(word, count + 1);
            } else {
                wordsHMap.put(word, 1);
            }
        }

        Stream<Map.Entry<String, Integer>> sortedByFrequencyStream = wordsHMap.entrySet().stream().sorted(Map.Entry.comparingByValue());
        Object[] sortedByFrequency = sortedByFrequencyStream.toArray(Object[]::new);

        System.out.println("Frequent words and number of appearances:");

        for(int i = 0; i < 5; i++) {
            System.out.println(sortedByFrequency[sortedByFrequency.length - 5 + i]);
        }
    }

    public void printLongestWord(){
        String[] words = text.split("\\s");

        String maxLengthWord = "";

        for(String word : words){
            if(word.length() > maxLengthWord.length()){
                maxLengthWord = word;
            }
        }

        System.out.println("The longest word in this text is " + maxLengthWord);
    }
}

class LettersInfo {
    int lettersCount, vowelsCount, consonantsCount;

    LettersInfo(int lettersCount, int vowelsCount, int consonantsCount){
        this.lettersCount = lettersCount;
        this.consonantsCount = consonantsCount;
        this.vowelsCount = vowelsCount;
    }

    @Override
    public String toString() {
        return "letters = " + lettersCount +
                "\nvowels = " + vowelsCount +
                "\nconsonants = " + consonantsCount;
    }
}