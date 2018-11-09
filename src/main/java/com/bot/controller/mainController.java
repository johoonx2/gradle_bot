package com.bot.controller;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class mainController extends ListenerAdapter {
    public static void main(String[] args) throws LoginException, RateLimitedException {
        if(args.length > 0) {
            new JDABuilder(AccountType.BOT)
                    .setToken(args[0])
                    .buildAsync();
        }else {
            System.out.println("Not found Token");
        }
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.println("Received!");
    }
}
