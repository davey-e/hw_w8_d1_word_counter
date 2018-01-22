package com.mycodeportfolio.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Dave on 22/01/2018.
 */

class WordCounter {

    String text;

    public WordCounter(String text){
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public int countWords() {
        if(this.text == ""){
            return 0;
        }
        int wordcount = this.text.split("\\s+").length;
        return wordcount;
    }

    public HashMap<String, Integer> countWordOccurrences() {
        HashMap<String, Integer> wordOccurrences = new HashMap<>();
        String[] words = this.text.split("\\s+");
        for(int i=0; i < this.countWords(); i++){
            String currentWord = words[i];
            currentWord = currentWord.replaceAll("\\W", "");
            if(wordOccurrences.containsKey(currentWord)) {
                wordOccurrences.put(currentWord, wordOccurrences.get(currentWord) + 1);
            } else {
                wordOccurrences.put(currentWord, 1);
            }
        }
        return wordOccurrences;
    }
}
