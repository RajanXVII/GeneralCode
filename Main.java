public static void main(String[] args) throws InterruptedException {
       
        Integer[] array = {1, 2, 3, 4, 5, 2, 3};
        String[] stringArray = {"apple", "banana", "apple", "orange", "banana"};
        Generic<String> gString = new Generic();
        Generic<Integer> gInt = new Generic();
        Set<Integer> intDuplicate = gInt.removeDuplicatesWithGenerics(array);
        intDuplicate.forEach(k -> {
            System.out.println("Unique Ints : " +  k);
        });
        Set<String> stringDuplicate  = gString.removeDuplicatesWithGenerics(stringArray);
        stringDuplicate.forEach(k -> {
            System.out.println("Unique Strings : " + k);
        });
    }
