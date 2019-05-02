import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
        
        //Add 18 leaf objects to the world
        //START   KEEP GOING AS LONG AS THIS IS TRUE   CHANGE BY
        for (int i = 1; i <= 18; i +=1)
        {
            // Create a leaf
            Leaf aLeaf = new Leaf();
            
            // Get a random location, use Get width instead of 600 ti avoid magic constant
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            
            //Add object of leaf
            addObject(aLeaf, x, y);
        }
    }
}
