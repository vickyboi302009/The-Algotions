import java.util.*;

public class flash {
     void main() {
    Scanner user = new Scanner(System.in);
    String []question =new String [100];
    String []answer = new String [100];
    int i=0;
do
{
System.out.println("Continue adding question or type 'Taketest' to review the flashcards");
    
System.out.println("Enter Your question");
    String ques = user.nextLine();
if    (ques.equals("Taketest")==true)
break;
System.out.println("Enter the answer");
    String ans = user.nextLine();
    question[i]=ques;
    answer[i]=ans;
    i++;
}

while (true);

  
for(int v = 0;v<i;v++){
    String quen = question[v];
    String ansn = answer[v];
System.out.println(quen);
    String usera =user.nextLine();
    if(usera.equals(ansn))
    {
System.out.println("Right answer");
}
else{
System.out.println("No the Right Answer is :"+ansn);
    }
}

    
    

    }
}
