package com.company.jmixkotlinsample.entity

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class Enumeration(private val id: String) : EnumClass<String> {
    NEW_VALUE("A");

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: String): Enumeration? = Enumeration.values().find { it.id == id }
    }
}