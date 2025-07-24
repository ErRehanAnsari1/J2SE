import java.util.*;

public class UniqueWords{
public static void main(String[] args){

String sentence="India is my country and India is great";

String[] words=sentence.split(" ");

LinkedHashSet<String> uniqueWords=new LinkedHashSet<>();

for(String word:words){
uniqueWords.add(word);
}
System.out.println("Unique words (in order) : "+uniqueWords);
}
}