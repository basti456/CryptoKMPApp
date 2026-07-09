package com.example.datastore

interface ValueSerializer<T> {

    fun serialize(value: T): PrimitiveValue

    fun deserialize(value: PrimitiveValue?): T?

}

object BuiltInSerializers {

    val BooleanSerializer: ValueSerializer<Boolean> = object : ValueSerializer<Boolean> {
        override fun serialize(value: Boolean): PrimitiveValue {
            return PrimitiveValue.BooleanValue(value)
        }

        override fun deserialize(value: PrimitiveValue?): Boolean? {
            return (value as? PrimitiveValue.BooleanValue)?.value
        }
    }
    val StringSerializer: ValueSerializer<String> = object : ValueSerializer<String> {
        override fun serialize(value: String): PrimitiveValue {
            return PrimitiveValue.StringValue(value)
        }

        override fun deserialize(value: PrimitiveValue?): String? {
            return (value as? PrimitiveValue.StringValue)?.value
        }
    }
    val IntSerializer: ValueSerializer<Int> = object : ValueSerializer<Int> {

        override fun serialize(value: Int): PrimitiveValue {
            return PrimitiveValue.IntValue(value)
        }

        override fun deserialize(value: PrimitiveValue?): Int? {
            return (value as? PrimitiveValue.IntValue)?.value
        }
    }
    val LongSerializer: ValueSerializer<Long> = object : ValueSerializer<Long> {
        override fun serialize(value: Long): PrimitiveValue {
            return PrimitiveValue.LongValue(value)
        }

        override fun deserialize(value: PrimitiveValue?): Long? {
            return (value as? PrimitiveValue.LongValue)?.value
        }
    }
    val DoubleSerializer: ValueSerializer<Double> = object : ValueSerializer<Double> {
        override fun serialize(value: Double): PrimitiveValue {
            return PrimitiveValue.DoubleValue(value)
        }

        override fun deserialize(value: PrimitiveValue?): Double? {
            return (value as? PrimitiveValue.DoubleValue)?.value
        }
    }
}