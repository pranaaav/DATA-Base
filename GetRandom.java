/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.Random;

/**
 *
 * @author hp
 */
public class GetRandom {
        int high;
        int low;
    public GetRandom(int low, int high){
        this.high=high;
        this.low=low;
    }
    
    public int getScore(){
        Random r = new Random();
        int Result = r.nextInt(high-low) + low;
        return Result;
    }
}
