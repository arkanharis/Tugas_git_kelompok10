
/**
 * Write a description of class Symbol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Symbol {
    private String name;
    private String[] symbolNames = {"Rock", "Paper", "Scissors"};
   
    public Symbol(int choice) {
        if (choice >= 1 && choice <= 3) {
            this.name = symbolNames[choice - 1];
        } else {
            throw new IllegalArgumentException("Invalid choice for Symbol constructor: " + choice);
        }
    }

    public String getName() {
        return name;
    }
    
}
