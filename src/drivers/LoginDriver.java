
package drivers;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.util.Map;
import java.util.Arrays;



public class LoginDriver {
    private static Object username;
    private static String typedPassword;
    private static String getPassword;
    
    private final static String HOST = "localhost";
    private final static int PORT = 27017;
    
    public LoginDriver(String user, String pass){
        username = user;
        typedPassword = pass;
    }
    
    public static boolean check(){
        try{
            
            //Create connection with MongoDB server
            MongoClient client = new MongoClient( HOST, PORT);
            //Connecting to Login database
            DB db = client.getDB("Login");
            //Getting respective collection
            DBCollection collection = db.getCollection("Students");
            //Creating search query using username given
            DBObject query = new BasicDBObject("username",username);
            DBCursor cursor = collection.find(query);
            //Store the found document in Map in (kay,value) form
            Map<String,String> m = cursor.next().toMap();
            getPassword = m.get("password");
         
        }
        catch(Exception e){
            System.err.println( e.getClass().getName() + ": "+ e.getMessage() );
        }
        if( typedPassword.equals(getPassword)){
                return true;
        }
        else
                return false;
        
    }
    
    
}
