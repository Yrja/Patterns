package com.example.patterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.patterns.builder.BookBuilder;
import com.example.patterns.builder.Director;
import com.example.patterns.builder.FeedbackBuilder;
import com.example.patterns.builder.entity.Book;
import com.example.patterns.builder.entity.Feedback;
import com.example.patterns.fabricMethod.factory.Dialog;
import com.example.patterns.fabricMethod.factory.WindowsDialog;
import com.example.patterns.singletone.Singletone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Builder
//        Director director = new Director();
//        BookBuilder bookBuilder = new BookBuilder();
//        director.createFantasyBook(bookBuilder);
//
//        Book book = bookBuilder.createInstance();
//
//        FeedbackBuilder feedbackBuilder = new FeedbackBuilder();
//        director.createFantasyBook(feedbackBuilder);
//
//        Feedback feedback = feedbackBuilder.createInstance();
//
//        Log.d("BOOK", book.toString());
//        Log.d("BOOK", feedback.printFeedback());

        //Singletone

//        Singletone s1 = Singletone.getSingletone("hello");
//        Singletone s2 = Singletone.getSingletone("world");
//        Log.d("SINGLETONE", s1.getName());
//        Log.d("SINGLETONE", s2.getName());

        Dialog dialog = new WindowsDialog();
        dialog.renderWindow();

    }
}
