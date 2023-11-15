import java.util.Random;

public class Bot extends Player{

    public Bot(){
        this.name ="Computer";
        this.score = 0;
    }

    public String getName(){
        return name;
    }

    public void setChoice(){
        Random random = new Random();
        this.choice = random.nextInt(3) + 1;
    }

    @Override
    public int getChoice(){
        return choice;
    }
}