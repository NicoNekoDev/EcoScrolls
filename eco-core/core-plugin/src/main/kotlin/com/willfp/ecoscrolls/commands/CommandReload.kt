package com.willfp.ecoscrolls.commands

import com.willfp.eco.core.command.impl.Subcommand
import com.willfp.ecoscrolls.plugin
import org.bukkit.command.CommandSender

object CommandReload : Subcommand(
    plugin,
    "reload",
    "ecoscrolls.command.reload",
    false
) {
    override fun onExecute(sender: CommandSender, args: List<String>) {
        plugin.reload()
        sender.sendMessage(plugin.langYml.getMessage("reloaded"))
    }
}
