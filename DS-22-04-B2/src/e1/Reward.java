package e1;

public interface Reward {
    public default Number calculateReward(){
        throw new IllegalArgumentException("You need to specify the type of character to calculate its reward!");
    }
}
