package com.example.tenantmanagementsystem

import java.io.Serializable

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) : Serializable {

    // Creates the text displayed on the tenant screen.
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}