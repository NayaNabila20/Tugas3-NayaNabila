package com.example.contactsapp.model

data class Contact(
    val id: Int,
    val name: String,
    val email: String,
    val address: String,
    val imageRes: Int // ID gambar lokal
)