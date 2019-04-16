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
    // primitive data type (int)
    int frames;
    // object data type... square brackets [] indicate an array (a list)
    // Data type: String
    String[] studentNames = {"Sarah", "Chelsea", "Jack", "Gavin", "Minah", "Brandon", "Jeewoo", "Peter", "Justy"};
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\" };
    String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4f", "4g" };
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        //start tracking frames 
        frames = 0;
        
        //initialize the array of student names
        
    }
    /**
     * Act - called repeadatly to creat animation
     */
    public void act()
    {
        //Every second, say hello to the next person in the list
        // Use a Boolean and to check both conditions
        // The showText statement only runs when both conditions are true
        //if ((frames % 60 == 0) && (frames / 60 < 60))
        
        //This Block of code runs once per second until the end of the
        //whiteKeys array
        
        //Note: whiteKyes.length automatically returns the correct number of
        //values 
        if (( frames % 60 == 0) && (frames / 60 < whiteKeys.length))
        {
            
            //showText("Hello " + studentNames[frames / 60], 400, 170);
        }
        // keep track of frames
        frames += 1;
        
        //show frames on screen
        showText(""+ frames, 100, 100);
        
        
    }
}