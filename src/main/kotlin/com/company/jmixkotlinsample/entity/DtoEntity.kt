package com.company.jmixkotlinsample.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.entity.annotation.JmixId
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*

@JmixEntity
open class DtoEntity {
    @JmixGeneratedValue
    @JmixId
    var id: UUID? = null

    @InstanceName
    var name: String? = null

    var age: String? = null
}