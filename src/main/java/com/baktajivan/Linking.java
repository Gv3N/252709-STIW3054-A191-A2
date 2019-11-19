package com.baktajivan;

import java.util.Arrays;

//link followers to their acc from getfol class
public class Linking {
    //followers name
    static String fol = GetFol.followers;
    static String [] arrFol = fol.split(" ");
    //followers info
    static String datafol = GetStats.data;
    static String [] arrStat = datafol.split("");
    //combine into row column array
    private static String [][] arrData = new String[arrFol.length][arrStat.length];

    public static void Link(){
        for (int i=0; i<arrData.length; i++) {
            for(int j=0; j<arrData[i].length; j++){
                arrData[i] = arrFol[i].split(",");
                arrData[i][j] = Arrays.toString(arrStat[j].split(" "));

                System.out.println(arrData[i][j]);

            }//for j
        }//for i

    }

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