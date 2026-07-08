package com.example.storage

import com.example.storage.database.CryptoDatabase

object CryptoAppDatabase {

    private var _db: CryptoDatabase? = null

    val db: CryptoDatabase
        get() = _db ?: error(
            "AppDatabase is not initialised. " +
                    "Call AppDatabase.init(driver) in MainActivity / main() / MainViewController."
        )

    fun init(driverFactory: DriverFactory) {
        if (_db == null) {
            _db = CryptoDatabase(driverFactory.createDriver())
        }
    }
}