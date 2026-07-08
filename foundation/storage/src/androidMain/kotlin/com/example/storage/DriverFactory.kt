package com.example.storage

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.example.storage.database.CryptoDatabase



actual class DriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(
            schema = CryptoDatabase.Schema,
            context = context,
            name = "crypto.db"
        )
    }
}