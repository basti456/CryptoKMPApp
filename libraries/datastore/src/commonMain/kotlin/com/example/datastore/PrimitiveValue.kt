package com.example.datastore

sealed class PrimitiveValue {

    data class BooleanValue(val value: Boolean) : PrimitiveValue()
    data class StringValue(val value: String) : PrimitiveValue()
    data class IntValue(val value: Int) : PrimitiveValue()
    data class DoubleValue(val value: Double) : PrimitiveValue()
    data class LongValue(val value: Long) : PrimitiveValue()
    object NullValue : PrimitiveValue()
}