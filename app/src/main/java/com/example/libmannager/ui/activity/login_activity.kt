package com.pedropaulo.bookmanager.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.libmannager.R
import com.example.libmannager.adapter.BookRecyclerAdapter
import com.example.libmannager.model.Book

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_recycler_list)

        val recycler_book_view  = findViewById<RecyclerView>(R.id.book_recycler)
        val bookList = ArrayList<Book>()

        for(i in 1..1000){
            bookList.add(Book("Senhor dos Anéis", "1ed", "HarperCollins", "J.R.R. Tolkien",
                    "1954"))
        }

        recycler_book_view.adapter = BookRecyclerAdapter(this, bookList)
        recycler_book_view.layoutManager = LinearLayoutManager(this)
    }
}
