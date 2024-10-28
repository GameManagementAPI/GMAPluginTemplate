package de.c4vxl.template.handlers

import de.c4vxl.gamemanager.gamemanagementapi.event.*
import de.c4vxl.gamemanager.gamemanagementapi.game.GameState
import de.c4vxl.template.GMAPlugin
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

object GameHandler : Listener {
    init {
        Bukkit.getPluginManager().registerEvents(this, GMAPlugin.instance)
    }

    @EventHandler
    fun onGameStart(event: GameStateChangeEvent) {
        if (event.newState != GameState.RUNNING) return


    }

    @EventHandler
    fun onPlayerDeath(event: GamePlayerRespawnEvent) {

    }

    @EventHandler
    fun onPlayerEliminate(event: GamePlayerEliminateEvent) {

    }

    @EventHandler
    fun onPlayerJoin(event: GamePlayerJoinEvent) {

    }

    @EventHandler
    fun onPlayerQuit(event: GamePlayerQuitEvent) {

    }
}