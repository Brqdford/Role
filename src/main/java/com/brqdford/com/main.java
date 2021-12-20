package com.brqdford.com;


import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.args.GenericArguments;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.data.manipulator.mutable.DisplayNameData;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.living.player.tab.TabList;
import org.spongepowered.api.entity.living.player.tab.TabListEntry;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.scoreboard.Scoreboard;
import org.spongepowered.api.scoreboard.Team;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

import java.util.Optional;
import java.util.Random;


@Plugin(id = "roleplugin", name = "Roleplugin", version = "1.0", description = "rolegiver", authors = "Brqdford")
public class main {


    @Inject
    Game game;
    @Inject
    Logger logger;
    @Inject
    private PluginContainer container;

    private static main instance;


    @Listener
    public void onPreInit(GameInitializationEvent e) {
        instance = this;
    }
    Scoreboard scoreboard;

    @Listener
    public void onGameInit(GameInitializationEvent e) {
        logger.info(container.getName() +
                " running (version "
                + container.getVersion().orElse("UNSTABLE")
                + ")");


        CommandSpec commandman = CommandSpec.builder()
                .arguments(
                        GenericArguments.remainingJoinedStrings(Text.of("rolename/clear"))
                )
                .executor((CommandSource src, CommandContext args) -> {
                    String message = args.<String>getOne("rolename/clear").get();
                    Player player = (Player) src;
                    scoreboard = player.getScoreboard();
                    if (message.equalsIgnoreCase("clear")){
                        Random random = new Random();

                        int nnumber = random.nextInt(999999999);
                        TabList tabList = player.getTabList();
                        Team teams = Team.builder().name("t" + nnumber).prefix(Text.of("§f")).allowFriendlyFire(true).canSeeFriendlyInvisibles(false).build();
                        teams.addMember(player.getTeamRepresentation());
                        scoreboard.registerTeam(teams);
                        Sponge.getServer().getOnlinePlayers().stream().forEach(p -> {
                            Optional<TabListEntry> opEntry = tabList.getEntry(p.getUniqueId());
                            if(!opEntry.isPresent()){
                                return;
                            }
                            opEntry.get().setDisplayName(Text.of(p.getName()));
                        });

                        src.sendMessage(Text.of(TextColors.GREEN, "Your role has been cleared."));
                    }else if (message.toLowerCase().contains("NIGGER".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("NIGGA".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("RETARD".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("CUNT".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("BEANER".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("SPICK".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("HITLER".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("RACIST".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("NAZI".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("JEW".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("PILLOCK".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("FAG".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("FAGGOT".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("NEGRO".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("DYKE".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("CHINK".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("TRANNY".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("TRANNIE".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("COON".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("MONKEY".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("GRINGO".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("JAPIE".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("OREO".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("REDSKIN".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("FAT".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("OBESE".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("PSEUDO".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("CHIEN".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("PEDOPHILE".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("HENTAI".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("CHILDPORN".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("PORN".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("SALOPE".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("ENCULE".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("FDP".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("CONNARD".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("PUSSY".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("PUTE".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("PENIS".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("DICK".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("COCK".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("FUCK".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("SHIT".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("BASTARD".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("STAFF".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("MODERATOR".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("MOD".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("HELPER".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("ADMIN".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("OWNER".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("COOWNER".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("VIP".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("EPIC".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("LEGENDARY".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("SUPREME".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("OVERLORD".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("0VERLORD".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("SUPR3ME".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("0WNER".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("M0D".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("H3LPER".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("NIGG3R".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("N1GGA".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("N1GGER".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("P0RN".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.toLowerCase().contains("NEGR0".toLowerCase())) {
                        src.sendMessage(Text.of(TextColors.RED, "You are not allowed to set this as your role."));
                    }else if (message.length() >= 11){
                        src.sendMessage(Text.of(TextColors.RED, "Too many characters role can only be 10 characters or less."));
                    }else {

                        Random random = new Random();

                        int nnumber = random.nextInt(999999999);
                        TabList tabList = player.getTabList();
                        Team teams = Team.builder().name("t" + nnumber).prefix(Text.of("[",TextColors.DARK_AQUA, message,TextColors.WHITE, "]")).allowFriendlyFire(true).canSeeFriendlyInvisibles(false).build();
                        teams.addMember(player.getTeamRepresentation());
                        scoreboard.registerTeam(teams);
                        Sponge.getServer().getOnlinePlayers().stream().forEach(p -> {
                            Optional<TabListEntry> opEntry = tabList.getEntry(p.getUniqueId());
                            if(!opEntry.isPresent()){
                                return;
                            }
                            opEntry.get().setDisplayName(Text.of(p.getName()));
                        });
                        src.sendMessage(Text.of(TextColors.GREEN, "Your role has been changed to ", message, "."));
                    }

                    return CommandResult.success();
                })
                .build();
        Sponge.getCommandManager().register(container, commandman, "role");
    }


    @Listener
    public void onPlayerJoin(ClientConnectionEvent.Join e){
        Player player = e.getTargetEntity();
        TabList tabList = player.getTabList();
        Scoreboard scoreboard = player.getScoreboard();
            Random random = new Random();

            int nnumber = random.nextInt(999999999);

            Team teams = Team.builder().name("t" + nnumber).prefix(Text.of("§f")).allowFriendlyFire(true).canSeeFriendlyInvisibles(false).build();
            teams.addMember(player.getTeamRepresentation());
            scoreboard.registerTeam(teams);
        Sponge.getServer().getOnlinePlayers().stream().forEach(p -> {
            Optional<TabListEntry> opEntry = tabList.getEntry(p.getUniqueId());
            if(!opEntry.isPresent()){
                return;
            }
            opEntry.get().setDisplayName(Text.of(p.getName()));
        });
    }

}
