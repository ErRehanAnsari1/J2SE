import java.util.*;

public class PhoneBook{
public static void main(String[] args){

List<String>phoneNumbers=new ArrayList<>();

phoneNumbers.add("9898989898");
phoneNumbers.add("8989898989");
phoneNumbers.add("9898989898");
phoneNumbers.add("5656565656");
phoneNumbers.add("8989898989");

System.out.println("Original List : "+phoneNumbers);
System.out.println("Size of List : "+phoneNumbers.size());

Set<String>uniqueNumbers=new HashSet<>(phoneNumbers);

System.out.println("Unique Numbers Set : "+uniqueNumbers);
System.out.println("Size of Set : "+uniqueNumbers.size());


}
}