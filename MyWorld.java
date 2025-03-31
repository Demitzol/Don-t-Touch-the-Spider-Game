import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

public static int lives=3;
public static int score=0;
    public MyWorld()
    {    
         super(600, 400, 1); 
       
         score=0;
         lives=3;
         showText("Lives "+lives,50,50);
    showText("Score "+score,50,70);
        for (int i=0; i<=4; i++)
        {
        addObject(new ball1(),Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(300)) ;
       }
       for (int i=0; i<=4; i++)
        {
        addObject(new ball2(),Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(300)) ;
       }
       for (int i=0; i<=4; i++)
        {
        addObject(new spider(),Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(300)) ;
       }
       addObject(new pacman(),300,380);
    }
    public void act ()
    {
     showText("Lives "+lives,50,50);
     showText("Score "+score,50,70);
     if (MyWorld.score==10)
     {
         showText("YOU ",50,50);
         showText("WON ",50,70);
         Greenfoot.stop();
         Greenfoot.playSound("goodresult.mp3");
     }
     if (MyWorld.lives==0)
     {
         showText("YOU ",50,50);
         showText("LOST ",50,70);
         Greenfoot.stop();
         Greenfoot.playSound("losing-horn.mp3");
     }
    }
}
