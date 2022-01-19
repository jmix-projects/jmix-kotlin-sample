package com.company.jmixkotlinsample.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "PLAIN_JPA_ENTITY")
@Entity
open class House {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "HIEGHT", precision = 19, scale = 2)
    var hieght: BigDecimal? = null

    @Column(name = "WIDTH", precision = 19, scale = 2)
    var width: BigDecimal? = null

    @OneToMany(mappedBy = "house")
    var floors: MutableList<Floor> = mutableListOf()
}