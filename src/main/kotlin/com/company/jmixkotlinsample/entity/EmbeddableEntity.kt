package com.company.jmixkotlinsample.entity

import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Column
import javax.persistence.Embeddable

@JmixEntity
@Embeddable
open class EmbeddableEntity {
    @Column(name = "TV")
    var tv: String? = null

    @Column(name = "KITCHEN_TABLE")
    var kitchen_table: String? = null
}