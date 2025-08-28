public class MethodPractice9{
public static int[] printSqrt(){

int [] sqrt=new int[19];
int index=0;

for(int i=2;i<=20;i++){

sqrt[index]=i*i;
index++;

}
return sqrt;
}
public static void main(String[] args){
int[] getsqrt=printSqrt();

System.out.println("square root of each number from 2 to 20 : ");
for(int num:getsqrt){
System.out.print(num+" ");
}
}
}