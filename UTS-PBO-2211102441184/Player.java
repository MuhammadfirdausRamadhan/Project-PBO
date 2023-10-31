import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int speed = 7;
    int r, g, b;
    int count = 0;
    
    public int playerLength;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r, g, b));
        getImage().fillRect(0, 0, 70, 70);
    }
    
    public void act()
    {
        count++;
        getWorld().addObject(new Tail(r, g, b), getX(), getY());
        move(speed);
        
        if (getX() <=0 || getX() >= getWorld().getWidth() - 1 ||
            getY() <= 0 || getY() >= getWorld().getHeight() - 1)
            {
                MyWorld myWorld = (MyWorld) getWorld();
                myWorld.displayYouLose();
            }

        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        
        eatFood();
    }
    
    public void eatFood()
    {
        if(isTouching(Food.class))
        {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.score.addScore();
            myWorld.addFood();
        }
    }
}