package me.arasple.mc.trchat.module.internal.hook

import me.arasple.mc.trchat.module.internal.hook.type.HookVanish
import org.bukkit.Bukkit
import org.bukkit.OfflinePlayer
import java.util.*

fun OfflinePlayer.isVanished(): Boolean {
    HookPlugin.registry.filterIsInstance<HookVanish>().forEach {
        if (it.isVanished(this)) return true
    }
    return false
}

fun UUID.isVanished(): Boolean {
    return Bukkit.getOfflinePlayer(this).isVanished()
}

fun String.isVanished(): Boolean {
    return Bukkit.getOfflinePlayer(this).isVanished()
}