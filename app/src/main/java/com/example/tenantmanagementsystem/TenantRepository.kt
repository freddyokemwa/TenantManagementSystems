package com.example.tenantmanagementsystem

// A single shared place to keep the tenants during app use.
object TenantRepository {

    val tenants = mutableListOf<Tenant>()

    // Adds a new tenant to the shared list.
    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    // Calculates the total rent for all tenants.
    fun totalRent(): Double {
        return tenants.sumOf {
            it.rent.toDoubleOrNull() ?: 0.0
        }
    }
}