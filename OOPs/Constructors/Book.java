public class Book{

String title;
int price;

Book(String str,int a){       //parameterized constructor 

title=str;
price=a;

}

void display(){
System.out.println("Book title :"+ title);
System.out.println("Book price :"+ price);
System.out.println();
}
public static void main(String[] args){

Book b1=new Book("java programming",500);
Book b2=new Book("Python basics",400);
b1.display();
b2.display();
}
}