package fr.nayeone.modogm;

import co.aikar.commands.PaperCommandManager;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.logging.Level;

public final class ModoGM extends JavaPlugin {

	private static final String prefix = ChatColor.YELLOW + "ModoGM" + ChatColor.DARK_GRAY + " » " + ChatColor.RESET;

	@Override
	public void onEnable() {
		PaperCommandManager cm = new PaperCommandManager(this);
		cm.registerCommand(new Command());
		cm.getCommandCompletions().registerAsyncCompletion(
				"modogm",
				context -> {
					Player player = context.getPlayer();
					player.playSound(player.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 1, 1);
					return Arrays.asList("survival", "creative", "adventure", "spectator");
				}
		);
		cm.enableUnstableAPI("help");
		getLogger().log(Level.INFO, "Plugin enabled");
	}

	@Override
	public void onDisable() {
		getLogger().log(Level.INFO, "Plugin disabled");
	}

	public static String getPrefix() {
		return prefix;
	}
}
