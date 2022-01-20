package com.company.jmixkotlinsample.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "HOUSE_OWNER")
@Entity
open class HouseOwner {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "house_owner")
    var house: House? = null
}