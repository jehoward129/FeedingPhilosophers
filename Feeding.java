/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework12;

import java.util.ArrayList;

/**
 *
 * @author jehow
 */
public class Feeding {

    public static void main(String[] args) {
        TroughPosition[] positions = new TroughPosition[4];

        positions[0] = new TroughPosition(0, 1, 2, 9);
        positions[1] = new TroughPosition(1, 3, 4, 10);
        positions[2] = new TroughPosition(2, 5, 6, 7);
        positions[3] = new TroughPosition(3, 8, 0);
        Philosopher[] philosophers = new Philosopher[10];
        philosophers[0] = new Philosopher(1, positions[0]);
        philosophers[1] = new Philosopher(2, positions[0]);
        philosophers[2] = new Philosopher(3, positions[1]);
        philosophers[3] = new Philosopher(4, positions[1]);
        philosophers[4] = new Philosopher(5, positions[2]);
        philosophers[5] = new Philosopher(6, positions[2]);
        philosophers[6] = new Philosopher(7, positions[3]);
        philosophers[7] = new Philosopher(8, positions[3]);
        philosophers[8] = new Philosopher(9, positions[0]);
        philosophers[9] = new Philosopher(10, positions[3]);
        
        for(Philosopher p: philosophers){
            p.start();
        }
    }
}
