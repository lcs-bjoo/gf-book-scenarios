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
    //String[] studentNames = {"Sarah", "Chelsea", "Jack", "Gavin", "Minah", "Brandon", "Jeewoo", "Peter", "Justy"};
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\" };
    String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4f", "4g", "4a" };
    String[] blackKeys = { "w", "e", "t", "y", "u", "o", "o", "]"};
    String[] blackNotes = { "3c#", "3d#", "3f#", "3g#", "3a#", "4c#", "4d#", "4f#"};
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
        
        //This Block of code runs once per second until the end of the
        //whiteKeys array
        
        //Note: whiteKyes.length automatically returns the correct number of
        //values in the array so we wont run past the end
        int position = frames / 60;
        if (( frames % 60 == 0) && (position < whiteKeys.length))
        {
            // Assemble the piano by creating each key one by one
            //This line creates a key object 
            Key anotherKey = new Key(whiteKeys[position], whiteNotes[position]);
            
            // This Line actually adds the object to the Piano world
            // OBJECT       HORIZONTAL POSITION      VERTICAL POSITIOn
            //  for the x position (horizontal position) of each key
            addObject(anotherKey, 54 + position * 63, 140); 
            //Only show a message when we are in the bounds of the array
            showText(" Array index is: " + frames / 60, 400, 250);
            
        }
        int position2 = (frames-660)/60 ;
        if (( frames % 60 == 0) && (frames > 659) && ((frames-660)/60 < blackKeys.length))
        
        // keep track of frames
        frames += 1;
        
        //show frames on screen
        //showText(""+ frames, 100, 100);
        
        
    }
}