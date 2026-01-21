import java.util.Date;
import java.text.SimpleDateFormat;

public class Person{
 String name;
 Date dateOfBirth;
 String address;
 int age;

Person(){

}

Person(String name,String address,Date dateOfBirth){
this.name=name;
this.address=address;
this.dateOfBirth=dateOfBirth;
}

public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}

public void setAddress(String address){
this.address=address;
}
public String getAddress(){
return address;
}

public void setDate(Date dateOfBirth){
this.dateOfBirth=dateOfBirth;
}
public String getDate(){
   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(dateOfBirth);
}

}