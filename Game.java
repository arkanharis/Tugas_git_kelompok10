
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n+--------------------------------------------------------------------------+");
        System.out.println("|                               << GAME SUIT >>                              |");
        System.out.println("| Selamat datang di Game Suit!                                               |");
        System.out.println("| Game Suit adalah permainan sederhana di mana Anda memilih antara           |");
        System.out.println("| Batu, Gunting, atau Kertas.                                                |");
        System.out.println("|                                                                            |");
        System.out.println("| Anda akan melawan komputer, dan aturan permainannya adalah                 |");
        System.out.println("| sebagai berikut:                                                           |");
        System.out.println("|   - Batu mengalahkan Gunting                                               |");
        System.out.println("|   - Gunting mengalahkan Kertas                                             |");
        System.out.println("|   - Kertas mengalahkan Batu                                                |");
        System.out.println("|                                                                            |");
        System.out.println("|                               1. Mainkan                                   |");
        System.out.println("|                               2. Keluar                                    |");
        System.out.println("+----------------------------------------------------------------------------+");
        System.out.print("Masukkan pilihan Anda: ");

        int pilihan = 0;
        while (true) {
            try {
                pilihan = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                input.nextLine(); // Membersihkan buffer input
                System.out.print(
                        "===========================\nMohon masukkan input angka!\n===========================\n>");
                continue;
            }

            if (pilihan == 2) {
                System.out.print("\n===========\nTERIMAKASIH\n===========\n");
                System.exit(0);
            } else if (pilihan == 1) {
                break;
            }

            System.out.print(
                    "===========================\nMohon masukkan input yang benar!\n===========================\n>");
        }

        input.nextLine(); // Membersihkan buffer setelah input angka
        System.out.print("Masukkan nama: ");
        RealPlayer player = new RealPlayer(input.nextLine());
        Bot bot = new Bot();

        //MEMULAI PERMAINAN
        while (true) {
            System.out.println("\n====== GAME SUIT =======");

            // Permainan hanya 5 kali set
            for (int i = 0; i < 5; i++){
                while (true) {            
                    System.out.println("Masukkan pilihan anda:");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Scissors\n");
                    System.out.print(">");

                    int choice = 0;
                    try {
                        choice = input.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        input.nextLine(); // Membersihkan buffer input
                        System.out.println(
                                "===========================\nMohon masukkan input angka!\n===========================\n");
                        continue;
                    }

                    if(choice >= 1 && choice <= 3){
                        player.setChoice(choice);
                        bot.setChoice();
                        break;
                    }

                    System.out.println("==========================\nMasukkan input yang benar!\n==========================");
                }

                System.out.println(Game.result(player, bot)+"\n");
                
            }                        

            // Mencetak nilai akhir dari user
            Game.showResult(player, bot);           

            // Menentukan pakah user lanjut bermain atau tidak
            System.out.print("\nApakah anda ingin bermain lagi?\n1. iya\n2. tidak\n\n");
            int lanjut;
            while (true) {
                try {
                    System.out.print(">");
                    lanjut = input.nextInt();
                } catch (java.util.InputMismatchException e) {
                    input.nextLine(); // Membersihkan buffer input
                    System.out.println(
                            "===========================\nMohon masukkan input angka!\n===========================\n");
                    continue;
                }

                if (lanjut == 1 || lanjut == 2) {
                    break;
                } else {
                    System.out.println(
                            "=================================\nMohon input command dengan benar!\n=================================\n");
                }
            }

            if (lanjut == 2) {
                System.out.print("\nTerimakasih " + player.getName() + " sudah bermain!.\n");
                break;
            }

        }

        input.close();
    }    
}


