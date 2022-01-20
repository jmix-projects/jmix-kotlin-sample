package com.company.jmixkotlinsample.entity

import io.jmix.core.DeletePolicy
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.entity.annotation.OnDeleteInverse
import io.jmix.core.metamodel.annotation.JmixEntity
import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "PLAIN_JPA_ENTITY", indexes = [
    Index(name = "IDX_HOUSE_HOUSE_OWNER_ID", columnList = "HOUSE_OWNER_ID")
])
@Entity
open class House {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "HOUSE_OWNER_ID")
    @OneToOne(fetch = FetchType.LAZY)
    var house_owner: HouseOwner? = null

    @Column(name = "HIEGHT", precision = 19, scale = 2)
    var hieght: BigDecimal? = null

    @Column(name = "WIDTH", precision = 19, scale = 2)
    var width: BigDecimal? = null

    @OneToMany(mappedBy = "house")
    var floors: MutableList<Floor> = mutableListOf()

    @JoinTable(name = "TENANT_HOUSE_LINK",
            joinColumns = [JoinColumn(name = "HOUSE_ID")],
            inverseJoinColumns = [JoinColumn(name = "TENANT_ID")])
    @ManyToMany
    var tenants: MutableList<Tenant> = mutableListOf()

}