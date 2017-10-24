/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author student
 */
public class Hockeyplayer extends Sportsman{
    
    private int goals = 0;
    private int assists = 0;
    private int number = 0;
    
    public Hockeyplayer(String jmeno, int energy) {
        super(jmeno, energy);
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() + "Hockeyplayer{" + "goals=" + goals + ", assists=" + assists + ", number=" + number + '}';
    }
    
    
    
}
