import java.util.LinkedHashSet;

public class MovieLogical{
public static void main(String[] args){

LinkedHashSet<String>mvs=new LinkedHashSet<>();

mvs.add("3 idiots");
mvs.add("Inception");
mvs.add("Tere naam");
mvs.add("Ghajini");
mvs.add("Ranjhana");
mvs.add("Wanted");

System.out.println("Set before removal operation: "+mvs);

int index=0;
String fifthmovie=null;

for(String movie:mvs){

if(index==4){
fifthmovie=movie;
break;
}

index++;
}

if(fifthmovie !=null){

mvs.remove(fifthmovie);
System.out.println("Set after removing 5th inserted("+fifthmovie+") : "+mvs);

}
else{
System.out.println("There are less than 5 elements in a set");
}
}
}