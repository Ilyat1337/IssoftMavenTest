import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleLogger {
    private static final Logger log = LoggerFactory.getLogger(ConsoleLogger.class);

    public static void main(String[] args) {
        log.info("Logging to console!");
        log.debug("Debug level test.");
        log.error("Error level test.");
    }
}
