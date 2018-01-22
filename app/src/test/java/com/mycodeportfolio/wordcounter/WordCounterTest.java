package com.mycodeportfolio.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dave on 22/01/2018.
 */

public class WordCounterTest {

    WordCounter text;

    @Before
    public void before(){
        text = new WordCounter("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity");
    }

    @Test
    public void hasText(){
        assertEquals("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity", text.getText());
    }

    @Test
    public void canCountWords(){
        assertEquals(36, text.countWords());
    }
}
