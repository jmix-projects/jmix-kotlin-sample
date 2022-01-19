package com.company.jmixkotlinsample.entity

import io.jmix.core.entity.annotation.EmbeddedParameters
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ROOM")
@Entity
open class Room {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinColumn(name = "FLOOR_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var floor: Floor? = null

    @EmbeddedParameters(nullAllowed = false)
    @Embedded
    @AttributeOverrides(
            value = [
                AttributeOverride(name = "tv", column = Column(name = "GOODS_TV")),
                AttributeOverride(name = "kitchen_table", column = Column(name = "GOODS_KITCHEN_TABLE"))
            ],
    )
    var goods: EmbeddableEntity? = null
}