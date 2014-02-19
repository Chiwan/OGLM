package invidualBoard;

/**
* Created by Quentin on 20/02/14.
* This class create a Room with a number of ant in the room and a track of birth. This class is an abstract class for the inheritance with the other room of the individual board.
 */
public abstract class Room {

    private int antNumber;
    private BirthTrack birthTrack;

    /**
     * The constructor create a Room with a specific number of ant and a track of birth.
     * @param antNumber
     * @param birthTrack
     */
    public Room(int antNumber, BirthTrack birthTrack){
        this.antNumber = antNumber;
        this.birthTrack = birthTrack;
    }

    public BirthTrack getBirthTrack() {
        return birthTrack;
    }

    public int getAntNumber() {
        return antNumber;
    }

    public Room(){
         this(0,null);
    }

    public void setAntNumber(int antNumber) {
        this.antNumber = antNumber;
    }

    public void setBirthTrack(BirthTrack birthTrack) {
        this.birthTrack = birthTrack;
    }
}
