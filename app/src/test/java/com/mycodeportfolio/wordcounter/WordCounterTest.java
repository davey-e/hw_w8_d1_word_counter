package com.mycodeportfolio.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dave on 22/01/2018.
 */

public class WordCounterTest {

    WordCounter textLong;
    WordCounter textShort;
    WordCounter textNoWords;

    @Before
    public void before(){
        textLong = new WordCounter("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity");
        textShort = new WordCounter("Hello");
        textNoWords = new WordCounter("");
    }

    @Test
    public void hasText(){
        assertEquals("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity", textLong.getText());
    }

    @Test
    public void canCountWordsLongText(){
        assertEquals(36, textLong.countWords());
    }

    @Test
    public void canCountWordsOneWord(){
        assertEquals(1, textShort.countWords());
    }

    @Test
    public void canCountWordsNoWords(){
        assertEquals(0, textNoWords.countWords());
    }
}
