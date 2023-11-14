
/**
 * Write a description of class Symbol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Symbol
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }
    
    abstract String getVictoryWords();
}
