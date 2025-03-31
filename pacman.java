import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pacman extends Actor
{
    /**
     * Act - do whatever the pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
if (Greenfoot.isKeyDown("left"))
       setLocation(getX()-5, getY());       
           if (Greenfoot.isKeyDown("right"))
       setLocation(getX()+5, getY());
              if (Greenfoot.isKeyDown("up"))
       setLocation(getX(), getY()-5);
              if (Greenfoot.isKeyDown("down"))
       setLocation(getX(), getY()+5); 
       if (isTouching(ball1.class))
        {
            removeTouching(ball1.class);
            MyWorld.score++;
        }
       if (isTouching(ball2.class))
       {
           removeTouching(ball2.class);
           MyWorld.score++;
       }
if (isTouching(spider.class))
{
    removeTouching(spider.class);
    MyWorld.lives--;
}
 
 if (MyWorld.score==10)
     {
         setLocation(300, 200);
     }
 
     if (MyWorld.lives==0)
     {
         setLocation(300, 200);
     }

    }
}

