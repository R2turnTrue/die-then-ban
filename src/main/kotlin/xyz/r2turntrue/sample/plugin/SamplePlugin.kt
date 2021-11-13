package xyz.r2turntrue.sample.plugin

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.plugin.java.JavaPlugin

/**
 * @author Monun
 */
class SamplePlugin : JavaPlugin(), Listener {
    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
    }

    @EventHandler
    fun death(event: PlayerDeathEvent) {
        event.player.banPlayer("저런...")
    }
}