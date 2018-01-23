package com.mycodeportfolio.wordcounter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class WordCounterActivity extends AppCompatActivity {

    EditText textToCountWordsFor;
    TextView countWordsResult;
    TextView wordOccurrencesResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        textToCountWordsFor = findViewById(R.id.wordsText);
        countWordsResult = findViewById(R.id.countWordsResult);
        wordOccurrencesResult = findViewById(R.id.wordOccurrencesResult);
    }

    public void onCountWordsButtonClick(View button){
        InputMethodManager imm = (InputMethodManager)getSystemService(
                Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(countWordsResult.getWindowToken(), 0);
        WordCounter words = new WordCounter(textToCountWordsFor.getText().toString());
        Integer wordCount = words.countWords();
        countWordsResult.setText("Number of words = " + wordCount.toString());
        HashMap<String, Integer> wordOccurrences = words.countWordOccurrences();
        wordOccurrencesResult.setText("");
        for (HashMap.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            wordOccurrencesResult.append(key + " occurs " + value + " times");
            wordOccurrencesResult.append(System.getProperty("line.separator"));
        }



    }


}
