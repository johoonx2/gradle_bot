package com.bot.controller;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class mainController {
    public static void main(String[] args) throws LoginException, RateLimitedException{
        CommandClientBuilder commandClientBuilder = new CommandClientBuilder();
        //our prefix is !!
        commandClientBuilder.setPrefix("!!");
        //"Type !!help"
        commandClientBuilder.useDefaultGame();
        commandClientBuilder.addCommand(new HelloWorldCommand());
        new JDABuilder(AccountType.BOT)
                .setToken(args[0])
                .addEventListener(commandClientBuilder.build())
                .buildAsync();
    }
    public static class HelloWorldCommand extends Command {
        public HelloWorldCommand() {
            this.name = "helloworld";
            this.aliases = new String[]{"hw"};
            this.help = "says hello";
        }
        @Override
        protected void execute(CommandEvent commandEvent) {
            commandEvent.reply("Hello world!");
        }
    }
}
