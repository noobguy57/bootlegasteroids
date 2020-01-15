import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteroid extends Actor
{
    /**
     * Act - do whatever the asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     touchingEdge();
     move(-2);
     lookForShip();
    }
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    public void touchingEdge()
    {
        if (atWorldEdge()) 
         {
           turn(Greenfoot.getRandomNumber(90));
         }
    }
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    
    /**
     * Try to eat an object of class 'clss'. This is only successful if there
     * is such an object where we currently are. Otherwise this method does
     * nothing.
     */
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
    public void lookForShip() 
    {
       if (canSee(Spaceship.class)) 
           {
            eat(Spaceship.class);
            Greenfoot.playSound("Die.wav");
            Greenfoot.stop();
           }   
    }
    
}
