package fr.nayeone.modogm;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandAlias("modogm")
public class Command extends BaseCommand {

	@Default
	@CommandCompletion("@modogm")
	public static void onCommand(CommandSender sender) {
		sender.sendMessage(ModoGM.getPrefix() + "Développé par NayeOne.");
	}

	@Subcommand("survival")
	@CommandPermission("modogm.survival")
	public static void onSurvival(Player player) {
		player.setGameMode(GameMode.SURVIVAL);
		player.sendMessage(ModoGM.getPrefix() + "Vous êtes maintenant en mode " + ChatColor.RED + "survie" + ChatColor.RESET + ".");
	}

	@Subcommand("creative")
	@CommandPermission("modogm.creative")
	public static void onCreative(Player player) {
		player.setGameMode(GameMode.CREATIVE);
		player.sendMessage(ModoGM.getPrefix() + "Vous êtes maintenant en mode " + ChatColor.RED + "créatif" + ChatColor.RESET + ".");
	}

	@Subcommand("adventure")
	@CommandPermission("modogm.adventure")
	public static void onAdventure(Player player) {
		player.setGameMode(GameMode.ADVENTURE);
		player.sendMessage(ModoGM.getPrefix() + "Vous êtes maintenant en mode " + ChatColor.RED + "adventure" + ChatColor.RESET + ".");
	}

	@Subcommand("spectator")
	@CommandPermission("modogm.spectator")
	public static void onSpectator(Player player) {
		player.setGameMode(GameMode.SPECTATOR);
		player.sendMessage(ModoGM.getPrefix() + "Vous êtes maintenant en mode " + ChatColor.RED + "spectateur" + ChatColor.RESET + ".");
	}

}
