import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int upArrow;
    public void act() 
    {
     keyPress();
     move(1);
    }
    
    public void keyPress()
    {
       if (Greenfoot.isKeyDown("left"))
        {
          turn(-2);
        }
       if (Greenfoot.isKeyDown("right"))
        {
          turn(2);
        } 
    }
    
}
