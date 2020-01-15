import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 768, 1);
        addObject(new Spaceship(), 520 ,760 );
        for (int i=0; i<21; i++)
        {
          addObject(new asteroid(), Greenfoot.getRandomNumber(1024), Greenfoot.getRandomNumber(750));
        }
    }
}
