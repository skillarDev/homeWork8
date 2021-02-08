public class Robot implements Participants {
    private String name;
    private int jumpBoundary;
    private int runBoundary;
    private boolean participant;

    public Robot(String name, int jumpBoundary, int runBoundary){
        this.name = name;
        this.jumpBoundary = jumpBoundary;
        this.runBoundary = runBoundary;
        participant = true;
    }

    @Override
    public boolean isParticipant() {
        return participant;
    }

    @Override
    public void jump(Wall obstacle) {
        if(obstacle.getHeight() < jumpBoundary) {
            System.out.println("Робот "+name+" перепрыгнул препятствие: "+obstacle.getName());
        } else {
            System.out.println("Робот "+name+" не перепрыгнул препятствие: "+obstacle.getName());
            participant = false;
        }
    }

    @Override
    public void run(Track obstacle) {
        if(obstacle.getLength() < runBoundary) {
            System.out.println("Робот "+name+" пробежал препятствие: "+obstacle.getName());
        } else {
            System.out.println("Робот "+name+" не пробежал препятствие: "+obstacle.getName());
            participant = false;
        }
    }
}
