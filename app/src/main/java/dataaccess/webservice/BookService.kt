package dataaccess.webservice

import com.example.libmannager.entity.Book
import retrofit2.Call
import retrofit2.http.GET

/*Serve para listar os métodos que darão acesso às informações do WS.
* O método 'getBookList()', por exemplo, retorna uma lista com todos os livros armazenados.
* Se eu quisesse expandir, talvez poderia criar um método 'getBookByName()' que receberia o nome de um livro como
* parâmetro e retornasse seus dados!*/
interface BookService {
    @GET("livros")
    fun getBookList(): Call<ArrayList<Book>>
}