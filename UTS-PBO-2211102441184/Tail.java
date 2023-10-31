import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Actor
{
    /**
     * Act - do whatever the Tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int playerLength;
    int r, g, b;
    int framecounter ;
    int countLength = 30;
    
    public Tail(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r, g, b));
        getImage().fillRect(0, 0, 70, 70);
    }
    
    public void act()
    {
        framecounter++;
        if (framecounter >= 60)
        {
            getWorld().removeObject(this);
        }
        
        countLength++;
        if (countLength == 30)
        {
            getWorld().removeObject(this);
            playerLength += 1;
        }
    }
}