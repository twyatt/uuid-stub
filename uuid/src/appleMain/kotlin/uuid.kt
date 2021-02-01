@file:Suppress("MemberVisibilityCanBePrivate")

package com.benasher44.uuid

public actual class Uuid @Deprecated("Use `uuidOf` instead.", ReplaceWith("uuidOf(uuid)")) constructor(internal val uuidBytes: ByteArray) : Comparable<Uuid> {

    @Suppress("DEPRECATION")
    public actual constructor(msb: Long, lsb: Long) : this(byteArrayOf())

    public actual val mostSignificantBits: Long
        get() = TODO()

    public actual val leastSignificantBits: Long
        get() = TODO()

    override fun toString(): String = TODO()
    override fun equals(other: Any?): Boolean = TODO()
    override fun hashCode(): Int = TODO()
    override fun compareTo(other: Uuid): Int = TODO()
}

public actual val Uuid.bytes: ByteArray
    get() = TODO()

public actual val Uuid.variant: Int
    get() = TODO()

public actual val Uuid.version: Int
    get() = TODO()

@Suppress("DEPRECATION")
public actual fun uuidOf(bytes: ByteArray): Uuid = TODO()

public actual fun uuidFrom(string: String): Uuid = TODO()

@Suppress("DEPRECATION")
public actual fun uuid4(): Uuid = TODO()
