/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework12;

import java.util.Random;

/**
 *
 * @author jehow
 */
public class TroughPosition {
    private int id, pos1, pos2, pos3;
    private boolean feeding;
    private Random random = new Random();

    public TroughPosition(int id, int pos1, int pos2) {
        this.id = id;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.feeding = false;
    }

    public TroughPosition(int id, int pos1, int pos2, int pos3) {
        this.id = id;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.pos3 = pos3;
        this.feeding = false;
    }
    
    public synchronized boolean startEating(int id){
        try{
            System.out.println(id + " is feeding.");
        
        
            this.feeding = true;
            Thread.sleep(random.nextInt(100) + 1);
            finishEating();
            System.out.println("\t" + id + " has finished feeding.");
        }catch(InterruptedException e){
            return false;
        }
        return true;
    }
    
    public void finishEating(){
        this.feeding = false;
    }

    
    
    
    
    
    
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPos1() {
        return pos1;
    }

    public void setPos1(int pos1) {
        this.pos1 = pos1;
    }

    public int getPos2() {
        return pos2;
    }

    public void setPos2(int pos2) {
        this.pos2 = pos2;
    }

    public int getPos3() {
        return pos3;
    }

    public void setPos3(int pos3) {
        this.pos3 = pos3;
    }

    public boolean isFeeding() {
        return feeding;
    }

    public void setFeeding(boolean feeding) {
        this.feeding = feeding;
    }
    
}
