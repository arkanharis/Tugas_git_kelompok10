
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Game {
    public static String result(RealPlayer player, Bot bot){
        // 1. Rock
        // 2. Paper
        // 3. Scissors
        Symbol playerSymbol = new Symbol(player.getChoice());
        Symbol botSymbol = new Symbol(bot.getChoice());
        System.out.println("\n"+player.getName()+" chose "+playerSymbol.getName()+" <<>> "+bot.getName()+" chose "+ botSymbol.getName());
        if(player.getChoice() == 1){
            if (bot.getChoice() == 3) {
                player.addScore();
                return(playerSymbol.getVictoryWord()+" ["+player.getName()+"] Wins! score [+1]");
            }
            else if (bot.getChoice() == 2) {
                bot.addScore();
                return(botSymbol.getVictoryWord()+" ["+bot.getName()+"] Wins!");
            }
        }

        if(player.getChoice() == 2){
            if (bot.getChoice() == 1) {
                player.addScore();
                return(playerSymbol.getVictoryWord()+" ["+player.getName()+"] Wins! score [+1]");
            }
            else if (bot.getChoice() == 3) {
                bot.addScore();
                return(botSymbol.getVictoryWord()+" ["+bot.getName()+"] Wins!");
            }
        }

        if(player.getChoice() == 3){
            if (bot.getChoice() == 2) {
                player.addScore();
                return(playerSymbol.getVictoryWord()+" ["+player.getName()+"] Wins! score [+1]");
            }
            else if (bot.getChoice() == 1) {
                bot.addScore();
                return(botSymbol.getVictoryWord()+" ["+bot.getName()+"] Wins!");
            }
        }
        
            return("No one wins this time, it's a draw! ");
    }

    public static void showResult(RealPlayer player, Bot bot){
        System.out.println(player.getName()+" Score: "+player.getScore()+"\n"+bot.getName()+" Score: "+bot.getScore());
        if(player.getScore() > bot.getScore()){
            System.out.println("<<< "+player.getName()+" Win this game! with "+player.getScore()+" scores >>>");
        }
        else if(player.getScore() < bot.getScore()){
            System.out.println("<<< "+bot.getName()+" Win this game! with "+bot.getScore()+" scores >>>");
        }
        else{
            System.out.println("<<< The Final Result is DRAW! >>>");
        }
    }
}


