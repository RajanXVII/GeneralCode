package root;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        * Create a list of these sentences then use stream to find out number of occurrences of 'Java' from these sentences.
            Input:
            "Java, java , Java is my world",
            "Java  oops",
            "Java collections, etc"
            Output:
            Number of occurrences of word 'java/Java': 5
            Note : Using Streams API
        * */
       List<String> sentences = List.of("Java java Java is my world", "Java oops", "Java collections etc");
       List<Integer> repition = new ArrayList<>();
       AtomicInteger count = new AtomicInteger();
       sentences.stream().forEach(sentence -> {
           String[] split = sentence.split(" ");
           for(String s : split) {
               if(s.contains("Java")) {
                   count.getAndIncrement();
               }
           }
           repition.add(count.get());
           count.set(0);
       });
       repition.forEach((k)-> {
           System.out.println("Reption of java" + k);
       });
       
    }

}

