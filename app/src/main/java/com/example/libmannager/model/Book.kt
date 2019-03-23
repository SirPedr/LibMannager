package com.example.libmannager.model

import java.time.Year
import java.util.Date

class Book(private val name: String, private val edition : String, private val pubCompany : String,
           private val author : String, private val year : String){

    fun getName() : String{
        return name
    }

    fun getEdition() : String {
        return edition
    }

    fun getPublishingCompany() : String {
        return pubCompany
    }

    fun getAuthor() : String {
        return author
    }

    fun getPubYear() : String {
        return year
    }
}