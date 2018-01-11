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
public class JAVA_PRG_06_02_Car_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car = new Car();
        
        car.setYear(1999);
        car.setMake("Buick");
        
        car.accelerate();
        System.out.println(car.getSpeed());
        
        car.accelerate();
        System.out.println(car.getSpeed());
        
        car.brake();
        System.out.println(car.getSpeed());
        
        car.accelerate();
        System.out.println(car.getSpeed());
        
        car.accelerate();
        System.out.println(car.getSpeed());
        
        car.brake();
        System.out.println(car.getSpeed());
        
        car.brake();
        System.out.println(car.getSpeed());
        
        car.brake();
        System.out.println(car.getSpeed());
        
        car.brake();
        System.out.println(car.getSpeed());
        
        car.brake();
        System.out.println(car.getSpeed());
        
        car.brake();
        System.out.println(car.getSpeed());
        
    }
    
}
