package huix.glacier.util;

import net.fabricmc.loader.impl.util.log.Log;
import net.fabricmc.loader.impl.util.log.LogCategory;

public class GlacierLog {
    public static final LogCategory category = LogCategory.create("glacier-api");

    public static void error(String format) {
        Log.error(category, format);
    }

    public static void warn(String format) {
        Log.warn(category, format);
    }

    public static void info(String format) {
        Log.info(category, format);
    }
}
