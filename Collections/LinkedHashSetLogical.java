import java.util.*;

public class LinkedHashSetLogical{
public static void main(String[] args){

LinkedHashSet<String>items=new LinkedHashSet<>();

items.add("Apple");
items.add("Banan");
items.add("Mango");
items.add("Orange");
items.add("Grapes");

System.out.println("Original set : "+items);

int index=0;

String thirdInserted=null;

for(String item:items){
if(index==2){
thirdInserted=item;
break;
}
index++;
}
if(thirdInserted!=null){
items.remove(thirdInserted);
System.out.println("After removing 3rd inserted ("+thirdInserted+"): "+items);
}
else{
System.out.println("Set has less than 3 elements");
}
}
}