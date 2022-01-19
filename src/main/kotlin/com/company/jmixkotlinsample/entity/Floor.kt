package com.company.jmixkotlinsample.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.Composition
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "FLOOR_")
@Entity(name = "Floor_")
open class Floor {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Composition
    @OneToMany(mappedBy = "floor")
    var room: MutableList<Room> = mutableListOf()

    @JoinColumn(name = "HOUSE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var house: House? = null

}