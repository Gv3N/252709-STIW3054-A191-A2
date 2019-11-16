package com.baktajivan;
//imports
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GetStats {
    public static void getStats(){
        try{
            //retrieve link to parse
            String gitlink = "https://github.com/GV3N?tab=followers";
            Document doc = Jsoup.connect(gitlink).get();
            //parse item from this container
            Elements links = doc.getElementsByClass("Counter hide-lg hide-md hide-sm").select("span");
            //System.out.println(links);
            //remove unnecessary details
            String data = links.text().replace("<span class=\"Counter hide-lg hide-md hide-sm\"> ", "").replace(" </span>", "");
            //System.out.println(data);
            //split data & store it in array
            String[]  arrStats = data.split(" ");

            for(int i=0;i<arrStats.length;i++) {
                System.out.println(arrStats[i]);
            }//for
        } catch (Exception e) {
            e.printStackTrace();
        }//catch
    }//getFol
}//end class
