public class Track implements Obstacle{
    private int length;
    private String name;

    public Track(int length, String name){
        this.length = length;
        this.name =name;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    @Override
    public void obstacle() {

    }
}
