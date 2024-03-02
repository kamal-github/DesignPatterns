import java.util.Arrays;
import java.util.List;

public class DwarvenGoldmineFacade {
    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldmineFacade() {
        workers = Arrays.asList(new DwarvenGoldDigger(), new DwarvenCartOperator());
    }

    public void startNewDay() {
        for (DwarvenMineWorker worker : workers) {
            worker.startNewDay();
        }
    }

    public void digOutGold() {
        for (DwarvenMineWorker worker : workers) {
            worker.digOutGold();
        }
    }

    public void endDay() {
        for (DwarvenMineWorker worker : workers) {
            worker.endDay();
        }
    }
}

abstract class DwarvenMineWorker {
    public abstract void startNewDay();
    public abstract void digOutGold();
    public abstract void endDay();
}

class DwarvenGoldDigger extends DwarvenMineWorker {
    public void startNewDay() {
        // Implementation here
        System.out.println("Dwarven gold digger starts a new day in the gold mine");
    }

    public void digOutGold() {
        // Implementation here
        System.out.println("Dwarven gold digger digs for gold");
    }

    public void endDay() {
        // Implementation here
        System.out.println("Dwarven gold digger ends its work");
    }
}

class DwarvenCartOperator extends DwarvenMineWorker {
    public void startNewDay() {
        // Implementation here
        System.out.println("Dwarven cart operator starts a new day");
    }

    public void digOutGold() {
        // Implementation here
        System.out.println("Dwarven cart operator digs for gold");
    }

    public void endDay() {
        // Implementation here
        System.out.println("Dwarven cart operator ends its work");
    }
}