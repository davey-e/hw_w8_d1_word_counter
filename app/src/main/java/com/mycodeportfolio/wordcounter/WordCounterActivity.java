package com.mycodeportfolio.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText textToCountWordsFor;
    TextView countWordsResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        textToCountWordsFor = findViewById(R.id.wordsText);
        countWordsResult = findViewById(R.id.countWordsResult);
    }

    public void onCountWordsButtonClick(View button){
        WordCounter words = new WordCounter(textToCountWordsFor.getText().toString());
        Integer wordCount = words.countWords();
        countWordsResult.setText("Number of words = " + wordCount.toString());
    }


}
