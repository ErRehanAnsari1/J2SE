import java.util.Date;
public class Person{
private String name="null";
private Date dateOfBirth=null;
private String address="null";

public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}

public void setDateOfBirth(Date dateOfBirth){
this.dateOfBirth=dateOfBirth;
}
public Date getDateOfBirth(){
return dateOfBirth;
}

public void setAddress(String address){
this.address=address;
}
public String getAddress(){
return address;
}
}