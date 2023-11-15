package project02startingfiles.PlayerData;

public abstract class Player {
    private int health;
    private int score;
    Player(int health, int score){
        this.health = health;
        this.score = score;
    }
    public abstract String getSpecialMove();
    public abstract void useSpecialMove();
    public void setHealth(int health){
        this.health = health;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getHealth(){
        return this.health;
    }
    public int getScore(){
        return this.score;
    }
    @Override
    public String toString(){
        return "health :" + this.health;
    }
}
