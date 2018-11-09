package com.bot.controller;

public class mainController {
    public static void main(String[] args){

        if(args.length > 0) {
            System.out.println("Token : " + args[0]);
        }else {
            System.out.println("Not found Token");
        }


    }
}
