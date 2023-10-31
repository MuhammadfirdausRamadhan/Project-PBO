import greenfoot.*;

public class Food extends Actor
{
    int framecounter;
    public int pertambahan = 5;

    public void Food()
    {
        framecounter++;
    }

    public void act()
    {
        framecounter++;
        if (framecounter >= 300)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(Player.class))
        {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.player.playerLength += pertambahan;
            getWorld().removeObject(this);
        }
    }
}