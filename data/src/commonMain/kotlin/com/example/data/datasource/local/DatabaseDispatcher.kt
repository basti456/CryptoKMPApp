package com.example.data.datasource.local

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

val DatabaseDispatcher: CoroutineDispatcher = Dispatchers.Default.limitedParallelism(1)