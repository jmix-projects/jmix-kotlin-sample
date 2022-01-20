package com.company.jmixkotlinsample.security

import io.jmix.security.role.annotation.ResourceRole
import io.jmix.security.role.annotation.SpecificPolicy
import io.jmix.securityui.role.annotation.MenuPolicy
import io.jmix.securityui.role.annotation.ScreenPolicy

@ResourceRole(name = "UserRole", code = "user-role")
interface UserRole {
    @MenuPolicy(menuIds = ["BlankScreen"])
    @ScreenPolicy(screenIds = ["BlankScreen", "MainScreen", "LoginScreen"])
    fun screens()

    @SpecificPolicy(resources = ["ui.loginToUi"])
    fun specify()

}