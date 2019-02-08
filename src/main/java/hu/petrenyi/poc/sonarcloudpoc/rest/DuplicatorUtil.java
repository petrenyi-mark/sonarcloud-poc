package hu.petrenyi.poc.sonarcloudpoc.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mark.petrenyi
 */
public class DuplicatorUtil {

    public static List<String> getStrings() {
        List<String> strings = new ArrayList<>();
        strings.add("100");
        strings.add("qwerty");
        strings.add("something");
        strings.clear();
        return strings;
    }

}
