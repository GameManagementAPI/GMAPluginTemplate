package de.c4vxl.template

import de.c4vxl.template.handlers.GameHandler
import dev.jorel.commandapi.CommandAPI
import dev.jorel.commandapi.CommandAPIBukkitConfig
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.plugin.java.JavaPlugin

class GMAPlugin : JavaPlugin() {
    companion object {
        val prefix: Component = Component.text("[").color(NamedTextColor.GRAY)
            .append(Component.text("GMA Plugin").color(NamedTextColor.GOLD))
            .append(Component.text("] ").color(NamedTextColor.GRAY))

        lateinit var instance: JavaPlugin
    }

    override fun onLoad() {
        instance = this

        CommandAPI.onLoad(CommandAPIBukkitConfig(this).silentLogs(true))
    }

    override fun onEnable() {
        // register commands
        CommandAPI.onEnable()

        // register listeners
        GameHandler

        logger.info("[+] $name has been enabled!")
    }

    override fun onDisable() {
        CommandAPI.onDisable()

        logger.info("[-] $name has been disabled!")
    }
}