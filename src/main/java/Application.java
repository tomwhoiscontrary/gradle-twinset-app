import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLClassLoader;
import java.util.Arrays;

public class Application {

    public static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        URLClassLoader classLoader = (URLClassLoader) Application.class.getClassLoader();
        LOGGER.info("classpath = {}", Arrays.asList(classLoader.getURLs()));

        Greeter greeter = (Greeter) Class.forName("GeneratedGreeter").newInstance();
        LOGGER.info(greeter.getMessage());
    }

}
