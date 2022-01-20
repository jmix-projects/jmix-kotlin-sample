package com.company.jmixkotlinsample.screen.house

import io.jmix.ui.screen.*
import com.company.jmixkotlinsample.entity.House

@UiController("House.edit")
@UiDescriptor("house-edit.xml")
@EditedEntityContainer("houseDc")
class HouseEdit : StandardEditor<House>()