public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
            new Wall(100, "Стена 1"),
            new Wall(150, "Стена 2"),
            new Wall(600, "Стена 3"),
            new Track(2000, "Беговая дорожка 1"),
            new Track(50, "Беговая дорожка 2"),
            new Track(500, "Беговая дорожка 3"),
        };

        Participants[] participants = {
                new Human("Иван",101, 501),
                new Cat("Борис",99, 60),
                new Robot("Т-1000",500,3000),
        };

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if(participants[i].isParticipant() && obstacles[j] instanceof Wall){
                    participants[i].jump((Wall) obstacles[j]);
                } else if(participants[i].isParticipant() && obstacles[j] instanceof Track){
                    participants[i].run((Track) obstacles[j]);
                }
            }
        }
    }
}
