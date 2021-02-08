public class Wall implements Obstacle{
    private int height;
    private String name;

    public Wall(int height, String name){
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public void obstacle() {

    }
}
