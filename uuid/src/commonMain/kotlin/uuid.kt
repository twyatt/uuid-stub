@file:kotlin.jvm.JvmName("UuidUtil")
@file:Suppress("MemberVisibilityCanBePrivate")

package com.benasher44.uuid

public expect class Uuid : Comparable<Uuid> {
    public constructor(msb: Long, lsb: Long)
    public val mostSignificantBits: Long
    public val leastSignificantBits: Long
}

public expect val Uuid.bytes: ByteArray
public expect val Uuid.variant: Int
public expect val Uuid.version: Int
public expect fun uuidFrom(string: String): Uuid
public expect fun uuidOf(bytes: ByteArray): Uuid
public expect fun uuid4(): Uuid

public interface UuidHasher {
    public val version: Int
    public fun update(input: ByteArray)
    public fun digest(): ByteArray
}

public fun nameBasedUuidOf(namespace: Uuid, name: String, hasher: UuidHasher): Uuid = TODO()
