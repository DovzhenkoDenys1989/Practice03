package com.company;

public class Main {

    public static void main(String[] args) {
      /** Задание 1*/
        byte b = 10;
        short s = 300;
        int i = 1000000;
        long l = 256555555;
        float f = 22.54f;
        double d = 234.5541d;
        char sym = '$';
        boolean isTrue = false;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sym);
        System.out.println(isTrue);


        /**Задание 2*/
        byte b1 = 35;
        short s1 = (byte)b1;
        int i1 = (short)s1;
        long l1 = (int)i1;
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        int i2 = 200_000;
        double d2 = (int)i2;
        System.out.println(i2);
        System.out.println(d2);

        short s3 = 250;
        float f3 = (short)s3;
        double d3 = (float)f3;
        System.out.println(s3);
        System.out.println(f3);
        System.out.println(d3);

        char c4 = 15000;
        int i4 = (char)c4;
        System.out.println(c4);
        System.out.println(i4);


        /**Задание 3*/
        int max = 2_147_483_647;
        float min = (int) max;
        System.out.println(max);
        System.out.println(min);


        /**Задание 4*/
        byte bmax = 127;
        bmax++;
        System.out.println(bmax);

        System.out.println(8 == 10 - 2? "Yes" : "No");

    }
    }



