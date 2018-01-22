package com.mycodeportfolio.wordcounter;

import java.util.ArrayList;

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
}
