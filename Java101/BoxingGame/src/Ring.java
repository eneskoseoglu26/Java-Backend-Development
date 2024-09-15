public class Ring {
    private Boxer boxer_1;
    private Boxer boxer_2;

    public Ring(Boxer boxer_1, Boxer boxer_2) {
        this.boxer_1 = boxer_1;
        this.boxer_2 = boxer_2;
    }

    public void fight() {
        boolean firstPunch = tossCoin();
        System.out.println("\n------GAME STARTING------\n");

        while(boxer_1.getHealth() > 0 && boxer_2.getHealth() > 0) {
            if(firstPunch) {
                boxer_2.setHealth(boxer_1.punch(boxer_2));
                if(boxer_2.getHealth() != 0) {
                    boxer_1.setHealth(boxer_2.punch(boxer_1));
                }
            } else {
                boxer_1.setHealth(boxer_2.punch(boxer_1));
                if(boxer_1.getHealth() != 0) {
                    boxer_2.setHealth(boxer_1.punch(boxer_2));
                }
            }
            boxersInfo();
        }

        System.out.println("\n------GAME ENDED------\n");
        if(boxer_1.getHealth() == 0) {
            System.out.println("WINNER : " + boxer_2.getName());
        } else {
            System.out.println("WINNER : " + boxer_1.getName());
        }

    }

    public boolean tossCoin() {
        double randomValue = Math.random() * 100;
        System.out.println("A coin is tossing to choose who will start the fight first.");
        System.out.println("Head => " + boxer_1.getName() + "\nTail => " + boxer_2.getName());
        if(randomValue <= 50) {
            System.out.println(boxer_1.getName() + " will start first!");
            return true;
        }
        System.out.println(boxer_2.getName() + " will start first!");
        return false;
    }

    public void boxersInfo() {
        System.out.println("\n" + this.boxer_1.getName() + "\t Health : " + this.boxer_1.getHealth());
        System.out.println(this.boxer_2.getName() + "\t Health : " + this.boxer_2.getHealth());
        System.out.println("\n=============================\n");
    }

}
