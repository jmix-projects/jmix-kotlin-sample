package com.company.jmixkotlinsample.screen.house

import io.jmix.ui.screen.*
import com.company.jmixkotlinsample.entity.House

@UiController("House.browse")
@UiDescriptor("house-browse.xml")
@LookupComponent("housesTable")
class HouseBrowse : StandardLookup<House>()