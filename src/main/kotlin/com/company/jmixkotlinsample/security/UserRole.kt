package com.company.jmixkotlinsample.security

import io.jmix.security.role.annotation.ResourceRole

@ResourceRole(name = "UserRole", code = "user-role")
interface UserRole {
}