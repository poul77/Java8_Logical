import java.util.*; 
import java.stream.*; 
class FindDuplicateNumber{  
public static void main(String args[]){  

 Stream input=Stream.of(1,2,3,3,4,2,5,6,7,5,8,6);
 
 Map<Integer,Long> occurrance=input.stream().collect(Collectors.groupingBy(i -> i ,Collectors.counting()));
 occurrance.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(entry -> System.out.println(entry.getKey());
 
}  
}  