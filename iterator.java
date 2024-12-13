import java.util.*;
class main{
    public static void main(String[] args){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        //to print set
        for(String s:a)
        {
            System.out.print(s+" ");
        }
        //printing using iterator class 
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        
    }
}