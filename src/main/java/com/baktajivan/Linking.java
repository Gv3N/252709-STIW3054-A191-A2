package com.baktajivan;
//link followers to their acc from getfol class
public class Linking {
    //public GetFol.getFol();//letak under a method later
    public static String folList = GetFol.followers;
    String [] dataFol = folList.split(" ");

    public static Linking[][] linkdata;

    /*//public static void link(){
        for (int i =0;i<folList.length;i++){
            int j = 0;
            //System.out.println(folarray[i][0]);
            System.out .println();
        }*/

    }

/*
* To do list
*check split loop ==> spit folList tu dlm for loop tu ke data[][]
* then utk stats dia
* method dia kena ambil return type string x[nama id login depa]
* the loop method should return that
* then edit getstats class removing sop and array split.
* create a loop for to insert data into data[][] column 2 [ no,name,stats] [call getstat method]
* create excel class
* then execute all in main where it prints out the output there == based on the format sir gave
* jgn lupa nak call getfol method.
*
* */