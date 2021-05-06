/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hp
 */
public class Game {
    ArrayList<Team> teams;
    public Game(ArrayList teams){
        this.teams=teams;
    }
    public void setTeams(ArrayList teams){
        this.teams=teams;
    }
    public ArrayList getTeams(){
       return this.teams;
    }
    public ArrayList playGame(){
        Team team1=teams.get(0);
        Team team2=teams.get(1); 
        int team1Rank=team1.getRanking();
        int team2Rank=team2.getRanking();
        int team1Score;
        int team2Score;
        if(team1Rank>team2Rank){
            GetRandom upset=new GetRandom(0,2);
            GetRandom score1=new GetRandom(0,5+upset.getScore());
            team1Score=score1.getScore();
            GetRandom score2=new GetRandom(0,5-(team1Rank-team2Rank)+upset.getScore());
            team2Score=score2.getScore();
        }else{
            GetRandom upset=new GetRandom(0,2);
            GetRandom score1=new GetRandom(0,5+upset.getScore());
            team2Score=score1.getScore();
            GetRandom score2=new GetRandom(0,5-(team2Rank-team1Rank)+upset.getScore());
            team1Score=score2.getScore();
        }
        if(team1Score>team2Score){
            team1.setGamesWon(team1.getGamesWon()+1);
            team2.setGamesLost(team2.getGamesLost()+1);
        }else if (team1Score<team2Score){
            team2.setGamesWon(team2.getGamesWon()+1);
            team1.setGamesLost(team1.getGamesLost()+1);
        }else if(team1Score==team2Score){
            team1.setGamesDrawn(team1.getGamesDrawn()+1);
            team2.setGamesDrawn(team2.getGamesDrawn ()+1);
        }
        GetRandom scoreline1=new GetRandom(0,team1Score);
        Player player1=team1.getPlayer1();
        Player player2=team1.getPlayer2();
        player1.setGoals(player1.getGoals()+scoreline1.getScore());
        player2.setGoals(player2.getGoals()+team1Score-scoreline1.getScore());
        
        GetRandom scoreline2=new GetRandom(0,team2Score);
        Player player3=team2.getPlayer1();
        Player player4=team2.getPlayer2();
        player3.setGoals(player3.getGoals()+scoreline2.getScore());
        player4.setGoals(player4.getGoals()+team1Score-scoreline2.getScore());
        
        GetRandom team1Yellow=new GetRandom(0,4);
        GetRandom team1Red=new GetRandom(0,2);
        team1.setYellowScore(team1.getYellowScore()+team1Yellow.getScore());
        team1.setRedScore(team1.getRedScore()+team1Red.getScore());
        
        GetRandom team2Yellow=new GetRandom(0,4);
        GetRandom team2Red=new GetRandom(0,2);
        team2.setYellowScore(team2.getYellowScore()+team2Yellow.getScore());
        team2.setRedScore(team2.getRedScore()+team2Red.getScore());
        
        teams.removeAll(teams);
        teams.add(team1);
        teams.add(team2);
        this.displayGameResults(team1Score, team2Score, team1Yellow.getScore(), team1Red.getScore(), team2Yellow.getScore(), team2Red.getScore());
        return teams;
    }
    public void displayGameResults(int team1Score, int team2Score,int team1Yellow,int team1Red,int team2Yellow,int team2Red){
        System.out.println("Game Result"+teams.get(0).getName()+" "+team1Score+" - "+teams.get(1).getName()+" "+team2Score);
        System.out.print("Cards Awarded:");
        if (team1Yellow>0){
            System.out.append(teams.get(0).getName()+team1Yellow+" Yellow card");
        }
        if (team1Red>0){
            System.out.append(teams.get(0).getName()+team1Red+" Red card");
        }
        if (team2Yellow>0){
            System.out.append(teams.get(1).getName()+team2Yellow+" Yellow card");
        }
        if (team2Red>0){
            System.out.append(teams.get(1).getName()+team2Red+" Red card");
        }
    }
}
 