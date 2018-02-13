import java.util.HashMap;
import java.util.Map;

public class Validate
{
    static Map<String,String> map=new HashMap<String, String>();
    static Map<String,String> map1=new HashMap<String, String>();
    public static boolean checkUser(String username,String pass)
    {
          map.put("ali","ali123");
          map.put("heshmat","heshmat123");
          if (map.containsKey(username)&&map.containsValue(pass)){

              return true;
          }
          else
              return false;
    }
    public static  boolean IsAdmin(String username,String pass){
        map1.put("eujine","eujine123");
        map1.put("mohamed","mohamed123");
        map1.put("admin","admin");
        if (map1.containsKey(username)&&map1.containsValue(pass)){
            return true;
        }
        else
            return false;
    }

}
