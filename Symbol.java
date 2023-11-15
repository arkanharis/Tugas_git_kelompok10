
/**
 * Write a description of class Symbol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;

public class Symbol {
    private String name;
    private String[] symbolNames = {"Rock", "Paper", "Scissors"};
    String[][] victoryWords = {
            {"Paper wraps up the win!", "Paper triumphs gracefully!", "Elegant victory for Paper!", "Paper is the master strategist!", "Folded perfection!"},
            {"Rock is the champion!", "Unstoppable Rock!", "Rock reigns supreme!", "The mighty Rock prevails!", "Rock dominates the game!"},
            {"Scissors cuts through the competition!", "Sharp victory for Scissors!", "Scissors triumphs with precision!", "Unbeatable Scissors!", "Victory in every snip!"}
    };

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
