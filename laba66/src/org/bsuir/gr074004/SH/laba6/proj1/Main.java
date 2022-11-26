package org.bsuir.gr074004.SH.laba6.proj1;

import org.bsuir.gr074004.SH.laba6.proj1.util.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] var0) {
        Main main1 = new Main();
        main1.metod();
    }
    public void metod(){
        String var1 = "a";
        Scanner sc = new Scanner(System.in);
        Util util = new Util();

        while(!var1.equals("end")) {
            var1 = sc.nextLine();
            util.Enter(var1);
        }}
}
