import java.util.*;
class main{
    public static void main(String[] args){
        LinkedList<String> a=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            String s=sc.next();
            a.addFirst(s);
        }
        
         
        for(int i=0;i<size;i++){

            System.out.println(a.get(i)+" ");
        }
        //cloning using linkedlist
        LinkedList<Integer> b=new LinkedList<>();
        b=(LinkedList)a.clone();
        System.out.println(b);
       
    
    }
}