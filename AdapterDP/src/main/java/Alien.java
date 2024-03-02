// Step 2: Create the Alien class
public class Alien implements AlienCharacter {

    @Override
    public void specificAttack() {
        System.out.println("Alien is attacking with its specific method!");
    }
}

interface AlienCharacter {
    public void specificAttack();
}