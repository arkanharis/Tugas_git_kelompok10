
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private String name;
    private int score;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        this.name = "Anonim";
        
    }
    
    
        public Player(String name )
    {
        // initialise instance variables
        this.name = name;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setNama(String name)
    {
        // put your code here
        this.name= name;
    }
    
    public void setScore(int Score)
    {       
        this.score = score;
    }

    public String getname(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }
    
}
