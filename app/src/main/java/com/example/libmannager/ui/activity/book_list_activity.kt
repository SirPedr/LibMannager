package com.example.libmannager.ui.activity

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.libmannager.R
import com.example.libmannager.adapter.BookRecyclerAdapter
import com.example.libmannager.viewmodel.BookViewModel

/**
 * PERGUNTA PRO DAVI:
 * 1) O que é BookService::class.java?
 * 2) Para que exatamente serve a interface?
 * 3) Como eu tenho um método que retorna uma instância de uma interface?
 * 4) Onde está a implementação dos métodos da interface?
 * 5) O que exatamente é um objeto 'Call'?
 * 6) Qual a função da classe de Repository?
 * 7) O que significa 'books.postValue(BookRepository.getBookWSList())' ?
 */
class BookListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.book_recycler_list)

        val recycler_book_view  = findViewById<RecyclerView>(R.id.book_recycler)
        val viewModel = ViewModelProviders.of(this).get(BookViewModel::class.java)

        viewModel.getBookList()

        viewModel.books.observe(this, Observer {
            if(it != null){
                recycler_book_view.adapter = BookRecyclerAdapter(this, it)
                recycler_book_view.layoutManager = LinearLayoutManager(this)
            }
        })


    }

}