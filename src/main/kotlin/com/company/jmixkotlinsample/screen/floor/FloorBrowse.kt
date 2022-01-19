package com.company.jmixkotlinsample.screen.floor

import io.jmix.ui.screen.*
import com.company.jmixkotlinsample.entity.Floor

@UiController("Floor_.browse")
@UiDescriptor("floor-browse.xml")
@LookupComponent("table")
class FloorBrowse : MasterDetailScreen<Floor>()