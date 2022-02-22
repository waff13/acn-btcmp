package Day05;

import java.util.Random;
import java.util.logging.*;

public class Task01 {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task01.class.getName());
        logger.log(Level.CONFIG, ".CONFIG " + logger.getName()); // is not printed out
        logger.log(Level.INFO, "INFO " + logger.getName());
        logger.log(Level.WARNING, "WARNING " + logger.getName());
        logger.log(Level.SEVERE, "SEVERE " + logger.getName());

        Random random = new Random();
        int capacity = random.nextInt(100);
        System.out.println("Capacity is " + capacity);

        if (capacity <= 50) {
            logger.log(Level.INFO, "Capacity is at " + capacity);
        } else if ((capacity > 50) && (capacity <= 75)) {
            logger.log(Level.WARNING, "Capacity is at " + capacity);
        } else if (capacity > 75) {
            logger.log(Level.SEVERE, "Capacity is at" + capacity);
        }
    }
}
