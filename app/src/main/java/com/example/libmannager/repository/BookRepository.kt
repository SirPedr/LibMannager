package com.example.libmannager.repository

import com.example.libmannager.model.Book
import dataaccess.webservice.BookServiceInitializer

/*Classe que é tipo uma 'Facade' para agrupar todos os métodos e passos necessários para relizar a requisição e
retornar os dados. Agrupam-se aqui:

1) O Initializer para configuração e criação do Retrofit
2) Dentro do Initializer, o Service, que dá acesso aos métodos disponíveis do WS*/
class BookRepository {
    fun getBookWSList(): List<Book>? {
        return BookServiceInitializer()
            .bookService()
            .getBookList()
            .execute()
            .body()
    }
}