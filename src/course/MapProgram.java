package course;

import java.util.Map;
import java.util.TreeMap;

public class MapProgram {
    public static void main(String[] args) {

        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username","Maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone","1773939222");
        cookies.remove("email");
        cookies.put("phone", "1449223211");

        System.out.println("Contains 'phone' key " + cookies.containsKey("phone") );
        System.out.println("Phone number: " + cookies.get("phone"));

        System.out.println("Email " + cookies.get("email"));
        System.out.println("size " + cookies.size());
        System.out.println("all cookies: ");
        for (String key: cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
