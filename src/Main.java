package com.company;

//Project Draw Rocket
//By: Grayson Boese
//Purpose: Draw a rocket shop that will vary in size based on a given width
public class DrawRocket {
    public final static int WIDTH = 5;
    public static void main(String[] args) {
        top();
        line();
        mid1();
        mid2();
        line();
        mid2();
        mid1();
        line();
        top();
    }
    public static void linePrint(int start, int end, String symbol){
        for(int i = start; i <= end; i++){
            System.out.print(symbol);
        }
    }
    public static void top(){
        for(int i = 1; i <= (2*WIDTH-1); i++){
            linePrint(i,(2*WIDTH-1), " ");
            linePrint(1, i, "/");
            System.out.print("**");
            linePrint(1, i, "\\");
            System.out.println();
        }
    }
    public static void mid1(){
        for(int i = 1; i <= (WIDTH); i++){
            System.out.print("|");
            linePrint(i, (WIDTH - 1), ".");
            linePrint(1,i,"/\\");
            linePrint(i,(WIDTH - 1),".");
            linePrint(i,(WIDTH - 1),".");
            linePrint(1,i,"/\\");
            linePrint(i,(WIDTH - 1),".");
            System.out.print("|");
            System.out.println();
        }
    }
    public static void mid2(){
        for(int i = 1; i <= WIDTH; i++){
            System.out.print("|");
            linePrint(1,i-1,".");
            linePrint(i,WIDTH,"\\/");
            linePrint(1,i-1,".");
            linePrint(1,i-1,".");
            linePrint(i,WIDTH,"\\/");
            linePrint(1,i-1,".");
            System.out.print("|");
            System.out.println();
        }
    }
    public static void line(){
        System.out.print("+");
        linePrint(1,(2*WIDTH),"=*");
        System.out.print("+");
        System.out.println();
    }
}

