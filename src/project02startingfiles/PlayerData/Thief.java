package project02startingfiles.PlayerData;

public class Thief extends Player {

    @Override
    public String getSpecialMove() {
        return "Sneak By";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The Thief sneaks by!");
    }

}
