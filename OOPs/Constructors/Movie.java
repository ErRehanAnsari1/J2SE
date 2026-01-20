public class Movie{

String title;
int rating;
String language;

Movie(){
this("Unknown",0,"Not Specified");
}
Movie(String title,int rating){
this(title,rating,"English");
}

Movie(String title,int rating,String language){
this.title=title;
this.rating=rating;
this.language=language;
}

void display(){
System.out.println("Title : "+title);
System.out.println("Rating : "+rating);
System.out.println("Language : "+language);
}
public static void main(String[] args){

Movie m1=new Movie();
m1.display();
System.out.println("..............................................");

Movie m2=new Movie("Avatar",9);
m2.display();
System.out.println("..............................................");

Movie m3=new Movie("Dangal",8,"Hindi");
m3.display();
}
}