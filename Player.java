/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author hp
 */
public class Player {
    private String name;
    private int goals;

    /**
     * Constructor for objects of class Player
     */
    public Player(String pName, int pGoals)
    {
        this.name=pName;
        this.goals=pGoals;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String pName){
        this.name=pName;
    }
    public int getGoals (){
        return this.goals;
    }
    public void setGoals(int pGoals){
        this.goals=pGoals;
    }
    public String toString(){
        return this.name+ " - Goals:"+this.goals;
    }    
}
