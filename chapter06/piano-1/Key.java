import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor


{
    private boolean isDown;
    /**
     * Create a new key.
     * Contructor - it runs once when a key object is created
     */
    public Key()
    {
        isDown = false;
    }
    /**
     * Do the action for this key.
     */
    public void act()
    {
        //when key image is not already showing"down"
        //and the g key on the keyboard has been pressed
        if ( isDown = false && Greenfoot.isKeyDown("g") )
        {
           setImage("white-key-down.png"); 
           isDown = true;
        }
        if ( isDown == true && Greenfoot.KeyDown("g") == false )
        {
            setImage("white-key.png");
            isDown = false;
        }
    }
}

