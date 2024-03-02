// Step 3 and 4: Create the AlienAdapter class
public class AlienAdapter implements Character {
    private final Alien alien;

    public AlienAdapter(Alien alien) {
        this.alien = alien;
    }

    @Override
    public void attack() {
        alien.specificAttack();
    }
}