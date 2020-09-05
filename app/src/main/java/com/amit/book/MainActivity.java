package com.amit.book;


import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;





import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstBook = new ArrayList<>();
        lstBook.add(new Book("C", R.drawable.c));
        lstBook.add(new Book("C++", R.drawable.ccc));
        lstBook.add(new Book("Java", R.drawable.java));
        lstBook.add(new Book("Android Studio", R.drawable.android));
        lstBook.add(new Book("Python", R.drawable.python));
        lstBook.add(new Book("Web Devlopment", R.drawable.html));
        lstBook.add(new Book("Java Script", R.drawable.js));
        lstBook.add(new Book("Php", R.drawable.php));
        lstBook.add(new Book("Ruby", R.drawable.ruby));
        lstBook.add(new Book("Ethical Hacking", R.drawable.hacking));



        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);


    }


}