import java.time.LocalDate;
public class Person1{
private String name;
private LocalDate dateOfBirth;
private String address;
public static int avg_age;

public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}

public void setDateOfBirth(LocalDate dateOfBirth){
this.dateOfBirth=dateOfBirth;
}
public LocalDate getDateOfBirth(){
return dateOfBirth;
}

public void setAddress(String address){
this.address=address;
}
public String getAddress(){
return address;
}
}