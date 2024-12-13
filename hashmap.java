import java.util.*;
class main{
    public static void main(String[] args)
    {
        HashMap <String,String> a=new HashMap<>();
        a.put("sno","01");
        a.put("sname","yash");
        a.put("city","chittoor");
        System.out.println(a);
        // printing hash map key value
        if(a.containsKey("sname"))
        {
            String d=a.get("sname");
            System.out.println(d); 
        }
        //modification value for a key
        a.put("sno","90");
        System.out.println(a); 
        a.remove("sname");
        System.out.println(a);  
    }
}