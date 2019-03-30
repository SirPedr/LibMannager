package com.example.libmannager.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.libmannager.entity.Book
import com.example.libmannager.repository.BookRepository
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class BookViewModel : ViewModel(){
    val books = MutableLiveData<ArrayList<Book>?>()

    private val executorService : ExecutorService by lazy {
       Executors.newSingleThreadExecutor()
    }

    fun getBookList(){
        executorService.execute{
            books.postValue(BookRepository.getBookWSList())
        }
    }


}