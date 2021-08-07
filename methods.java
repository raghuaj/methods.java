package com.raghu;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.print( Minstoyears(525600));
        System.out.print("years and");
        System.out.print( Mintodays(525600));
        System.out.print("days");
    }

    public static double Mintodays(int a) {
        double days = a * 0.000694444444;
        return days;
    }
    public static double Minstoyears(int a){
        return a*60*24*365;
    }
}
