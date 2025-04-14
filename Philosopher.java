/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework12;

import java.util.Random;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jehow
 */
public class Philosopher extends Thread{
    private int id, feedCount;
    TroughPosition position;
    Random random;



    public Philosopher(int id, TroughPosition position) {
        this.id = id;
        this.position = position;
    }

    /**
     *
     * @throws InterruptedException
     */
    @Override
    public void run(){
        for(int i = 0; i < 3; i++){
            this.feedCount ++;
            System.out.println("Philosopher id: " + id + " waiting. No. of times to feed: " + feedCount);
            while(!position.startEating(id)){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            try {
                Thread.sleep(new Random().nextInt(50) + 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    
    }
    

}
