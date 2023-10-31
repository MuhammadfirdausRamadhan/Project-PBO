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
    int framecounter;
    public Score score = new Score();
    public Player player = new Player(100, 0, 0);
    public YouLose youLose = new YouLose();
    int playerLength;
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Player player = new Player(100, 0, 0);
        addObject(player,769,377);
        addObject(score,48,30);
        score.setLocation(76,24);
        addFood();
    }
    
    public void act()
    {
        framecounter++;
        if (framecounter >= 600)
        {
            addFood();
        }
    }
    
    public void addFood()
    {
        addObject(new Food(), Greenfoot.getRandomNumber(getWidth() - 1), Greenfoot.getRandomNumber(getHeight() - 1));
            framecounter = 0;
    }
    
    public void displayYouLose()
    {
        addObject(youLose, 200, 200);
        youLose.setLocation(getWidth()/2,getHeight()/2);
        Greenfoot.stop();
    }
}
