package Day05;

import java.util.Random;
import java.util.logging.*;

public class Task02 {

    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Task01.class.getName());
        Handler fileHandler = new FileHandler("eventLog.log");
        logger.addHandler(fileHandler);
        fileHandler.setFormatter(new SimpleFormatter());

        Random random = new Random();
        int capacity = random.nextInt(10);
        System.out.println("Capacity: " + capacity);

        logger.setLevel(Level.WARNING); // only WARNING and SEVERE will get in the file

        if (capacity <= 5) {
            logger.info("Capacity is at " + capacity);
        } if ((capacity > 5) && (capacity <= 8)) {
            logger.warning("Capacity is at " + capacity);
        } if (capacity > 8) {
            logger.severe("Capacity is at " + capacity);
        }

    }
}
