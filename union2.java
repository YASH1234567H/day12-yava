import java.util.*;
class Main
{
    public static void main(String args[])
    {
        String arr1[]={"hello","hai","amar","raj"};
        String arr2[]={"raj","hello","rajitha"};
        Set <String> a=new HashSet<>();
        Set <String> b=new HashSet<>();
        Set <String> c=new HashSet<>();
        for(String s:arr1)
        a.add(s);
        for(String s1:arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set <String> u=new HashSet<>(a);
        u.addAll(b);
        System.out.println(u);
    }
}