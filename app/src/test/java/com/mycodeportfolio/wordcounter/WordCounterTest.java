package com.mycodeportfolio.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dave on 22/01/2018.
 */

public class WordCounterTest {

    WordCounter textLong;
    WordCounter textShort;
    WordCounter textMedium;
    WordCounter textNoWords;
    HashMap<String, Integer> wordOccurrences;

    @Before
    public void before(){
        textLong = new WordCounter("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity");
        textShort = new WordCounter("Hello");
        textMedium = new WordCounter("This is some repeated text, repeated text, text");
        textNoWords = new WordCounter("");

        wordOccurrences = new HashMap<>();
        wordOccurrences.put("This", 1);
        wordOccurrences.put("is", 1);
        wordOccurrences.put("some", 1);
        wordOccurrences.put("repeated", 2);
        wordOccurrences.put("text", 3);
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

    @Test
    public void canCountWordOccurrences(){
        assertEquals(wordOccurrences, textMedium.countWordOccurrences());
    }
}
