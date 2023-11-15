public class RealPlayer extends Player{
    
    public RealPlayer(String name){
        this.name = name;
        score = 0;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setChoice(int  choice){
        this.choice = choice;
    }

    @Override
    public int getChoice(){
        return choice;
    }

}