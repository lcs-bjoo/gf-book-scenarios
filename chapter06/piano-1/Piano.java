import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance variables (can be used anywhere below)
     */
    int frames;
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        //start tracking frames 
        frames = 0;
    }
    /**
     * Act - called repeadatly to creat animation
     */
    public void act()
    {
        // keep track of frames
        frames += 1;
        
        //show frames on screen
        showText(""+ frames, 100, 100);
    }
}