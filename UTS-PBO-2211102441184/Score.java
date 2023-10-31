import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score = 0;

    public Score()
    {
        setImage(new GreenfootImage("Score: " + score, 40, Color.BLACK, Color.WHITE));
    }

    public void act()
    {
        setImage(new GreenfootImage("Score: " + score, 40, Color.BLACK, Color.WHITE));
        // Add your action code here.
    }

    public void addScore()
    {
        score++; // Tambahkan 1 ke skor saat dipanggil.
    }
}