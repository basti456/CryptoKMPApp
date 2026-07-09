package com.example.datastore

class Key<T> internal constructor(
    val name: String,
    val serializer: ValueSerializer<T>
)

object Keys {
    fun booleanKey(name: String): Key<Boolean> = Key(name, BuiltInSerializers.BooleanSerializer)
    fun stringKey(name: String): Key<String> = Key(name, BuiltInSerializers.StringSerializer)
    fun intKey(name: String): Key<Int> = Key(name, BuiltInSerializers.IntSerializer)
    fun longKey(name: String): Key<Long> = Key(name, BuiltInSerializers.LongSerializer)
    fun doubleKey(name: String): Key<Double> = Key(name, BuiltInSerializers.DoubleSerializer)
}