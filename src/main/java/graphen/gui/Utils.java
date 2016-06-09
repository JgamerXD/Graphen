package graphen.gui;

import java.io.File;
import java.net.URL;

/**
 * Created by By_if1_08 on 09.06.2016.
 */
public class Utils {
    public static URL getResourceURL(String fileName) {
        URL url = null;

        try {
            //Get file from resources folder
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            url = classLoader.getResource(fileName);
        }
        catch (Exception e)
        {
            System.err.println("Error while loading resource (" + fileName + ")");
            e.printStackTrace(System.err);
        }
        return url;
    }


    public static File getResourceFile(String fileName) {
        File file = null;

        try {
            //Get file from resources folder
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            file = new File(classLoader.getResource(fileName).getFile());
        } catch (Exception e) {
            System.err.println("Error while loading resource (" + fileName + ")");
            e.printStackTrace(System.err);
        }
        return file;

    }

}
