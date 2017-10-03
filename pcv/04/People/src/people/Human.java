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

/* Třída human */
public class Human {
    //Vlastní výčtový typ
    public enum Sex {
       MAN, WOMAN, ATTACK_HELICOPTER 
    }
    //Atributy třídy
    private String name;
    private int age = 20;
    private int weight = 70;
    private float height = (float) 1.80;
    private Sex sex = Sex.MAN;
    
    /* Metody třídy Human */

    /* Konstruktor pro třídu Human */
    public Human(String jmeno){
        this.name = jmeno;
    }
    
    public Human(String jmeno, int age, Sex sex){
        this.name = jmeno;
        this.setAge(age);
        this.setSex(sex);
    }
    /* Getters a Setters */
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        if(age < 130 && age > 0){
        this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    public double getBMI(){
        return Math.round(this.weight / Math.pow(this.height, 2)*100.0)/100.0;
    }
    
    public String toString(){
        String output =  "My name is " + this.name + "\n";
        output += "I am " + this.getSex() + "\n";
        output += "My height is " + this.getHeight() + " meters\n";
        output += "My weight is " + this.getWeight() + " kilograms\n";
        output += "My age is " + this.getAge() + "\n";
        output += "My BMI is " + this.getBMI() + "\n";
        return output;
    }
}
