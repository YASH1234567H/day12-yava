import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet<String> a=new HashSet<>();
        // accp the
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            a.add(s);
        }
        System.out.println(a);
        a.remove("hi");
        System.out.println(a);
    }
}