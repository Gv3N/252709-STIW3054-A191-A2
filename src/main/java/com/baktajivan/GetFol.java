package com.baktajivan;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetFol {
    //public static String[] follist = new String[300];
    /*private static Regex regex = new Regex();
    private  static int x = 0;
    private  static int y = 0;*/
public static String followers;
public static Object[] folList;
    public static void getFol(){

        try {
            String gitlink1 = "https://github.com/zhamri?tab=followers";
            Document doc1 = Jsoup.connect(gitlink1).get();
            String gitlink2 = "https://github.com/zhamri?after=Y3Vyc29yOnYyOpK5MjAxOS0wMi0yMFQxMTo1NDozNSswODowMM4Cfdf-&tab=followers";
            Document doc2 = Jsoup.connect(gitlink2).get();
            String gitlink3 = "https://github.com/zhamri?after=Y3Vyc29yOnYyOpK5MjAxOC0wOS0xMlQxMzoxMjoyMyswODowMM4CPHOZ&tab=followers";
            Document doc3 = Jsoup.connect(gitlink3).get();
            String gitlink4 = "https://github.com/zhamri?after=Y3Vyc29yOnYyOpK5MjAxNy0wOS0xM1QyMDoxMjowNyswODowMM4BoF9b&tab=followers";
            Document doc4 = Jsoup.connect(gitlink4).get();

            //first 50 followers // should automate this with a thread but i dont know how and have limited time to do so.
            //disadvantage with these system will cause the new followers from the new page will not be displayed.
            Elements links = doc1.getElementsByClass("link-gray pl-1").select("span");
            String data1 = links.text().replace("<span class=\"link-gray pl-1\">", "").replace("</span>", "");
            String[]  arrName = data1.split(" ");

            for(int i=0;i<arrName.length;i++) {
                //System.out.println(arrName[i]);
                //System.out.println(i);now 50
            }//for data1

            //2nd batch
            Elements links2 = doc2.getElementsByClass("link-gray pl-1").select("span");
            String data2 = links2.text().replace("<span class=\"link-gray pl-1\">", "").replace("</span>", "");
            String[]  arrName2 = data2.split(" ");

            for(int i=0;i<arrName2.length;i++) {
                //System.out.println(arrName2[i]);
                //System.out.println(i);now 50
            }//for data2

            //3rd batch
            Elements links3 = doc3.getElementsByClass("link-gray pl-1").select("span");
            String data3 = links3.text().replace("<span class=\"link-gray pl-1\">", "").replace("</span>", "");
            String[]  arrName3 = data3.split(" ");

            for(int i=0;i<arrName3.length;i++) {
                //System.out.println(arrName3[i]);
                //System.out.println(i);now 50
            }//for data3

            //4th batch
            Elements links4 = doc4.getElementsByClass("link-gray pl-1").select("span");
            String data4 = links4.text().replace("<span class=\"link-gray pl-1\">", "").replace("</span>", "");
            String[]  arrName4 = data4.split(" ");

            for(int i=0;i<arrName4.length;i++) {
                //System.out.println(arrName4[i]);
                //System.out.println(i);now 50
            }//for data4

            //merge all the array into one array
            //converting them into list first
            List list = new ArrayList(Arrays.asList(arrName));
            //adds all arrays into list
            list.addAll(Arrays.asList(arrName2));
            list.addAll(Arrays.asList(arrName3));
            list.addAll(Arrays.asList(arrName4));
            //converting list into array
            folList = list.toArray();//using this array for another method.
            //converting array into string and removing the symbols
            //testing purpose only
            followers = Arrays.toString(folList).replace("[","").replace("]","").replace(",","");
            System.out.println(followers);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
//<span class="link-gray pl-1">muhdhariz</span>
//
//Elements links = doc.getElementsByClass("Counter hide-lg hide-md hide-sm").select("span");