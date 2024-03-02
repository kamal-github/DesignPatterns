public class EnemyShipMain {

    public static void main(String[] args) {

        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        EnemyShipBuilding enemyShipBuilder = new UFOEnemyShipBuilding();
        // EnemyShipBuilding rocketShipBuilder = new RocketShipBuilding();

        EnemyShip theGrunt = enemyShipBuilder.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

//        EnemyShip theBoss = enemyShipBuilder.orderTheShip("UFO BOSS");
//        System.out.println(theBoss + "\n");

    }

}