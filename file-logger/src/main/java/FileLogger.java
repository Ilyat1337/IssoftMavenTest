import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileLogger {
    private static Logger log = LoggerFactory.getLogger(FileLogger.class);

    public static void main(String[] args) {
        log.info("Logging to file!");
        log.debug("Debug level test.");
        log.error("Error level test.");
    }
}
