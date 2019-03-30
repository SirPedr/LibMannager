package com.example.libmannager.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.libmannager.R
import com.example.libmannager.adapter.BookRecyclerAdapter
import com.example.libmannager.model.Book
import com.example.libmannager.repository.BookRepository

/**
 * PERGUNTA PRO DAVI:
 * 1) O que é BookService::class.java?
 * 2) Para que exatamente serve a interface?
 * 3) Como eu tenho um método que retorna uma instância de uma interface?
 * 4) Onde está a implementação dos métodos da interface?
 * 5) O que exatamente é um objeto 'Call'?
 * 6) Qual a função da classe de Repository?
 */

class BookListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.book_recycler_list)

        val recycler_book_view  = findViewById<RecyclerView>(R.id.book_recycler)
        val bookList = ArrayList<Book>()

        val bookListWS = BookRepository().getBookWSList()

        /*TODO: Consertar o erro da passagem de parâmetros*/
        recycler_book_view.adapter = BookRecyclerAdapter(this, bookListWS)
        recycler_book_view.layoutManager = LinearLayoutManager(this)
    }

}