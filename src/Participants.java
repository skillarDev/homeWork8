public interface Participants {
    boolean isParticipant();
    void run(Track obstacle);
    void jump(Wall obstacle);
}
