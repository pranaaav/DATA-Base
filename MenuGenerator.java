/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MenuGenerator {

    /**
     * @param args the command line arguments
     */
    //static ArrayList<Team> teams=new ArrayList();
    static ArrayList<Team> teams;
    public MenuGenerator(){
        
    }
    public static void main(String[] args) throws IOException {
        setTeams();
    }
    public static void menu() throws IOException{
        System.out.println("A. Play Preliminary Stage");
        System.out.println("B. Play Final");
        System.out.println("C. Display Teams");
        System.out.println("D. Display players");
        System.out.println("E. Display cup results");
        System.out.println("X. Close");
        Scanner s=new Scanner(System.in);
        String input=s.next();
        if (input.equalsIgnoreCase("a")){
            
        }
    }
    public static void setTeams() throws IOException{
        System.out.println("Set team Players");
        ArrayList<ArrayList> data=LoadFile.getData();
        
        Scanner s=new Scanner(System.in);
        for (int i=0;i<data.size();i++){
            System.out.println(Integer.parseInt(data.get(i).get(1).toString()));
            System.out.println(data.get(i).get(0).toString()+" Player 1:");
            String player1Name=s.next();
            Player player1=new Player(player1Name,0);
            System.out.println(data.get(i).get(0).toString()+" Player 2:");
            String player2Name=s.next();
            Player player2=new Player(player2Name,0);
            Team team=new Team(data.get(i).get(0).toString(),Integer.parseInt(data.get(i).get(1).toString()),player1,player2);

        }
        menu();
    }
    
}
