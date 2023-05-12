package org.example;

import java.util.Scanner;

public class Main {
    static final int NUM_GEARS = 6;
    public static void main(String[] args) {
        int aa = 15;
        String anw = Integer.toString(aa);
        String ga[] = {"sd","dfwn","wfnke","dfne"};
        String b = ga[0] + ga[1] + ga[3];
        int bb = aa % 3 == 0 ? 1 : 0;
        char g = ga[0].charAt(0);
        System.out.println("substring : " + ga[1].substring(2,3));
        System.out.println(g);

//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        for(int i=0;i<a.length();i++){
//            char x = Character.isUpperCase(a.charAt(i)) ? Character.toUpperCase(a.charAt(i)) : Character.toLowerCase(a.charAt(i));
//            System.out.print(x);
//        }

        String[] an = {};
        an = new String[2];
        an[0] = ga[0];
        an[1] = ga[1];

        int x = ga.length;
        System.out.println("an들 : " + an[0] + an[1]);

        int n = 5;
        String control = "sdfnee";
        char ch[] = control.toCharArray();
        for(char c : ch){
            switch(c){
                case 's' : n=n+1;System.out.println("s 확인 : ");break;
                case 'd' : n=n+50;System.out.println("d확인");break;
                default : System.out.println("default");
            }
        }
        String str = "jfdgnl dfnke";
        int ck = str.indexOf(" ");
        System.out.println("indexof test : 1" + str.substring(ck+1));
        System.out.println("indexof test : 2" + str.substring(0,ck));






    }
}