package util;

import java.util.UUID;

/**
 * Author: 徐明皓
 * Date: 2021-08-02 15:34
 * Description: <描述>
 */
public class StringUtils {

    public static String renameFileName(String fileName){
        int dotIndex = fileName.lastIndexOf(".");
        String suffix = fileName.substring(dotIndex);
        return UUID.randomUUID().toString()+suffix;
    }
}
