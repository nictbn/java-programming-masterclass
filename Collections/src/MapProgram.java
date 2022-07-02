import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "This course is about Java");
            System.out.println("Java added successfully");
        }

        languages.put("Java", "A compiled, high-level, object-oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        languages.put("BASIC", "Beginners, ALl Purposes Symbolic Instruction Code");
        languages.put("LISP", "Therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about Java");
        }
        System.out.println(languages.get("Java"));

        System.out.println("======================");

//        languages.remove("LISP");
        if (languages.remove("Algol", "An algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key value pair not found");
        }

        if (languages.replace("LISP", "Therein lies madness", "A functional programming language with imperative features")) {
            System.out.println("LISP replaced");
        } else {
            System.out.println("LISP was not replaced");
        }
        System.out.println(languages.replace("Scala", "This will not be added"));
        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
