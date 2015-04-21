import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author Jan Kroon 
 * @version 1
 */
public class Car extends Actor
{
    public enum Colour { RED, BLUE, YELLOW };
    public Colour currentColour;
    public int year = 1959;
    
    /**
     * Constructor. This method is called when a new object of class Car is created
     */
    public Car(Car.Colour c) // Interactive inpunt after selection of 'new() Car' e.g. Car.Colour.RED
    {
        this.currentColour = c;
        switch (c) {
            case RED: { // Think: why not Colour.RED
                this.setImage(new GreenfootImage("Red-Car.jpg"));
                break;
            }
            case BLUE: {
                this.setImage(new GreenfootImage("Blue-Car.png"));
                break;
            }
            case YELLOW: {
                this.setImage(new GreenfootImage("Yellow-Car.jpeg"));
                break;
            }
            default:
                break;
        }
    }
    
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
