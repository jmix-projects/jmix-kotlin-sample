package com.company.jmixkotlinsample.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "TENANT")
@Entity
open class Tenant {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinTable(name = "TENANT_HOUSE_LINK",
            joinColumns = [JoinColumn(name = "TENANT_ID")],
            inverseJoinColumns = [JoinColumn(name = "HOUSE_ID")])
    @ManyToMany
    var houses: MutableList<House> = mutableListOf()
}