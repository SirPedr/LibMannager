package com.example.libmannager.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.libmannager.R
import com.example.libmannager.model.Book
import kotlinx.android.synthetic.main.book_card.view.*
import java.text.FieldPosition

class BookRecyclerAdapter(private val context: Context, private val books : List<Book>) :
    RecyclerView.Adapter<BookRecyclerAdapter.BookHolder>() {

    override fun onCreateViewHolder(viewGroup : ViewGroup, p1: Int): BookHolder {
        return BookHolder(LayoutInflater.from(context).inflate(R.layout.book_card, viewGroup, false))
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder : BookHolder, position : Int) {
        val book = books[position]

        holder.bookTitle.text = book.getName()
        holder.bookEdition.text = book.getEdition()
        holder.bookPub.text = book.getPublishingCompany()
        holder.bookAuthor.text = book.getAuthor()
        holder.bookYear.text = book.getPubYear()

    }

    class BookHolder(bookView : View) : RecyclerView.ViewHolder(bookView){
        val bookTitle = bookView.book_title
        val bookEdition = bookView.book_ed
        val bookPub = bookView.book_editora
        val bookAuthor = bookView.book_author
        val bookYear = bookView.book_year
    }
}