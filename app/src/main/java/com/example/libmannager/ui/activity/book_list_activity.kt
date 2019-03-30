package com.example.libmannager.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.libmannager.R
import com.example.libmannager.adapter.BookRecyclerAdapter
import com.example.libmannager.model.Book
import dataaccess.webservice.BookServiceInitializer


/**
 * PERGUNTA PRO DAVI:
 * 1) O que é BookService::class.java?
 * 2) Para que exatamente serve a interface?
 * 3) Como eu tenho um método que retorna uma instância de uma interface?
 * 4) Onde está a implementação dos métodos da interface?
 */

class BookListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.book_recycler_list)

        val recycler_book_view  = findViewById<RecyclerView>(R.id.book_recycler)
        val bookList = ArrayList<Book>()

        //recycler_book_view.adapter = BookRecyclerAdapter(this, bookList())
    }

}