/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 


public class Team {
    private String name;
    private int ranking;
    private Player player1;
    private Player player2;
    
    private int yellowScore;
    private int redScore;
    
    private int gamesWon;
    private int gamesLost;
    private int gamesDrawn;
    private int points;
    public Team(String tname, int ranking, Player player1, Player player2){
        this.name=tname;
        this.ranking=ranking;
        this.player1=player1;
        this.player2=player2;
        this.yellowScore=0;
        this.redScore=0;
        this.gamesWon=0;
        this.gamesDrawn=0;
        this.gamesLost=0;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRanking(){
        return this.ranking;
    }
    public void setRanking(int ranking){
        this.ranking=ranking;
    }
    public void setPlayer1(Player player1){
        this.player1=player1;
    }
    public Player getPlayer1(){
        return this.player1;
    }
    public void setPlayer2(Player player2){
        this.player2=player2;
    }
    public Player getPlayer2(){
        return this.player2;
    }   
    public void setYellowScore(int score){
        this.yellowScore=score;
    }
    public int getYellowScore(){
        return this.yellowScore;
    }
    public void setRedScore(int score){
        this.redScore=score;
    }
    public int getRedScore(){
        return this.redScore;
    }   
    public int getGamesWon(){
        return this.gamesWon;
    }
    public void setGamesWon(int games){
        this.gamesWon=games;
    }
    public int getGamesDrawn(){
        return this.gamesDrawn;
    }
    public void setGamesDrawn(int games){
        this.gamesDrawn=games;
    }    
    public int getGamesLost(){
        return this.gamesLost;
    }
    public void setGamesLost(int games){
        this.gamesLost=games;
    }    
}
