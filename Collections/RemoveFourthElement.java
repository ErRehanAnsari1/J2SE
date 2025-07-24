import java.util.*;
public class RemoveFourthElement{
public static void main(String[] args){

LinkedHashSet<Integer> numbers=new LinkedHashSet<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);
numbers.add(60);

System.out.println("Original Set : "+numbers);

int index=0;
int fourthInserted=0;

for(Integer num:numbers){
if(index==3){
fourthInserted=num;
break;
}
index++;
}

if(fourthInserted !=0){

numbers.remove(fourthInserted);                           
System.out.println("After removing 4th inserted ("+fourthInserted+"): "+numbers);

}

else{
System.out.println("Less than 4 elements in the set ");
}
}
}