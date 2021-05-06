/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class LoadFile {
    static ArrayList<ArrayList> data=new ArrayList<ArrayList>();
    
    
    
    private static String [] readFile(String filename) throws IOException{
        BufferedReader br=null;
        try{
           br=new BufferedReader(new FileReader(filename)); 
           StringBuilder sb=new StringBuilder();
           String line=br.readLine();
           while(line!=null){
               sb.append(line);
               sb.append("\n");
               line=br.readLine();
           }
           String everything=sb.toString();
           String [] blocks=everything.split("\n");
           return blocks;
        }catch (Exception e){
           e.printStackTrace();
           return null;
           
        }finally{
            br.close();
        }
        
    }
    
    public static void populateData() throws IOException{
       
        String arr[]=readFile("./teams.txt");
        for (int i=0;i<arr.length;i++){
            String[] details=arr[i].split(",");
             ArrayList<String> team=new ArrayList<String>();
             for (int j=0;j<details.length;j++){
                 team.add(details[j]);
             }
             data.add(team);
        }
    }
    public static ArrayList getData() throws IOException{
        populateData();
        return LoadFile.data;
    }
}
