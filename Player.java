
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Player {
    protected int score;
    protected int choice;
    protected String name;

    public int getScore(){
        return score;
    }

    public void addScore(){
        score += 1;
    }

    abstract int getChoice();    

}
