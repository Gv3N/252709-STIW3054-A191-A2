package com.baktajivan;
//imports
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GetStats {
    public static String [] arrStats;
    public static String [] folname = GetFol.followers.split(" ");
    public static String data;

    public static void getStats(){
        try{
            for(int i=0;i<folname.length;i++) {
                String login = folname[i];
                //retrieve link to parse
                String gitlink = "https://github.com/" + login + "?tab=followers";
                Document doc = Jsoup.connect(gitlink).get();
                //parse item from this container
                Elements links = doc.getElementsByClass("Counter hide-lg hide-md hide-sm").select("span");
                //System.out.println(links);
                //remove unnecessary details
                data = links.text().replace("<span class=\"Counter hide-lg hide-md hide-sm\"> ", "").replace(" </span>", "");
                //System.out.println(data);
                //split data & store it in array
                //arrStats = data.split(" ");

                /*for (int j = 0; j < arrStats.length; j++) {
                    System.out.println(arrStats[j]);
                }//for*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }//catch
    }//getFol
}//end class
