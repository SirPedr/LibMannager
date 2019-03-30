package dataaccess.webservice

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


//Classe que faz as configurações iniciais do Retrofit para o acesso ao WebService
class BookServiceInitializer {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://dti-livros.azurewebsites.net/api/") //Define URL Base da WS
        .addConverterFactory(GsonConverterFactory.create()) //Configura o conversor para os dados que chegarão (GSON)
        .build() //Constrói o Retrofit com as configurações aplicadas

    fun bookService() : BookService {
       return retrofit.create(BookService::class.java)
    }
}