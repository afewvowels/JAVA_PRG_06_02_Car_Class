/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_02_car_class;

/**
 *
 * @author bluebackdev
 */
public class Car {
    private int intYearModel;
    private int intSpeed = 0;
    
    private String strMake;
    
    /**
        Constructor that takes model year and make to create object instance.
        @param year Stores model year input
        @param make Stores make string input
     */
    public Car(int year, String make) {
        intYearModel = year;
        strMake = make;
    }
    
    /**
        No-arg constructor
     */
    public Car() {
        intYearModel = 0;
        strMake = "";
    }
    
    /**
        This method sets the cars model year.
        @param year User input to set model year.
     */
    public void setYear(int year) {
        intYearModel = year;
    }
    
    /**
        This method returns the cars model year.
        @return 
     */
    public int getYear() {
        return intYearModel;
    }
    
    /**
     * This method sets the cars make to the input string.
     * @param make 
     */
    public void setMake(String make) {
        strMake = make;
    }
    
    /**
     * This method returns the cars make as a string literal.
     * @return 
     */
    public String getMake() {
        return strMake;
    }
    
    /**
     * This method adds 5 to the car's speed.
     */
    public void accelerate() {
        intSpeed += 5;
    }
    
    /**
     * This method checks the car's speed and if it is greater than or equal
     * to 5 (mph) it subtracts 5 from the car's speed.
     */
    public void brake() {
        if (intSpeed >= 5) {
            intSpeed -= 5;
        }
    }
    
    /**
     * This method returns the car's speed as an integer value.
     * @return 
     */
    public int getSpeed() {
        return intSpeed;
    }
}
