package com.bootcamp.zadatak2;

public class Main {
    public static void main(String[] args) {
        SmartTV tvLG = new SmartTV();
        tvLG.setBrand("LG");
        tvLG.setChannel(1);

        tvLG.turnOnOff();

        tvLG.channelUp();
        tvLG.channelUp();

        tvLG.channelDown();
        tvLG.channelDown();

        tvLG.volumeUp();
        tvLG.volumeUp();
        tvLG.volumeUp();
        tvLG.volumeUp();

        tvLG.volumeDown();

        System.out.println(tvLG);
    }
}
