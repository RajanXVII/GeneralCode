import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Arrays-->"+convertListToArray(list));
        System.out.println("list-->"+convertArrayToList());
    }
    public static Integer[] convertListToArray(List<Integer> list){
        return list.toArray(new Integer[0]);
    }
    public static List<Integer> convertArrayToList(){
        return Arrays.asList(1,2,3);
    }
    
}