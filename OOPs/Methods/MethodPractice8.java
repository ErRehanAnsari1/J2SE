public class MethodPractice8{
public static int[] printEven(){

int [] arr=new int[50];
int index=0;

for(int i=1;i<=100;i++){
if(i%2==0){
arr[index]=i;
index++;
}
}
return arr;
}
public static void main(String[] args){

int[] printEvenNum=printEven();

System.out.println("Even numbers between 1 to 100 : ");

for(int i=0;i<printEvenNum.length;i++){
System.out.print(printEvenNum[i] + " ");
}

}
}