package com.mycodeportfolio.wordcounter;

import java.util.ArrayList;

/**
 * Created by Dave on 22/01/2018.
 */

class WordCount {

    String text;

    public WordCount(String text){
        this.text = text;
    }


    public String getText() {
        return this.text;
    }

    public int countWords() {
        int wordcount = this.text.split("\\w+").length;
        return wordcount;
    }
}
