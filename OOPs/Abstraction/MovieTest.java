interface Comedy{
void comedyScene();
}

interface Action{
void fightScene();;
}

class BollywoodMovie implements Comedy,Action{
public void comedyScene(){
System.out.println("Hera pheri style comedy scene");
}

public void fightScene(){
System.out.println("Singham style action scene");
}
}

public class MovieTest{
public static void main(String[] args){

BollywoodMovie bm=new BollywoodMovie();
bm.comedyScene();
bm.fightScene();
}
}