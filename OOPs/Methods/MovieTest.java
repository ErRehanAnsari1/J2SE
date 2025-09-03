public class MovieTest{
public static void main(String[] args){

Movie m=new Movie();

m.setTitle("Inception");
m.setGenre("Science Fiction");
m.setDuration(165);
m.setRating(9.4);

String ttl=m.getTitle();
String gnr=m.getGenre();
int drt=m.getDuration();
double rt=m.getRating();

System.out.println("Movie Title : "+ttl);
System.out.println("Movie Genre : "+gnr);
System.out.println("Movie Duration : "+drt +" minutes");
System.out.println("Movie Rating : "+rt +" IMDB Rating");
}
}