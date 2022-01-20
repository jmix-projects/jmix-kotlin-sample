package com.company.jmixkotlinsample.listener

import com.company.jmixkotlinsample.entity.House
import io.jmix.core.event.EntitySavingEvent
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
open class HouseEventListener {


    @EventListener
    open fun onHouseSaving(event: EntitySavingEvent<House>) {
      log.info("hello")
    }

    companion object {
        private val log = LoggerFactory.getLogger(HouseEventListener::class.java)
    }
}