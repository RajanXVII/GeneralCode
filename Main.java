package root;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
      
        /*
        * Find all the distinct characters from a given list of strings.
"hello", "world"
        * */
        Set<Character> chars = new HashSet<>();
        List.of("hello", "world").stream().forEach(r -> {
            for(char c : r.toCharArray()){
                chars.add(Character.valueOf(c));
            }
        });
        chars.forEach((k)-> {
            System.out.println("Chars : " + k);
        });
    }

}
