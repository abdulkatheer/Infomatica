
package drivers;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class requestLeave {
    
    private static Object name,rno,reason,days,from,to,today;
    private final static String HOST = "localhost";
    private final static int PORT = 27017;
    
    public requestLeave(String name, String rno, String reason, String days, String from, String to,String today){
        this.name = name;
        this.rno = rno;
        this.reason = reason;
        this.days = days;
        this.from = from;
        this.to = to;
        this.today = today;
    }
    public void upload(){
        //Create connection with MongoDB server
        MongoClient client = new MongoClient( HOST, PORT);
        //Connecting to Login database
        DB db = client.getDB("III");
        //Getting respective collection
        DBCollection collection = db.getCollection("LeaveRequests");
        //Creating an object to insert
        DBObject doc = new BasicDBObject("Name",name).append("Reg No", rno).append("Reason", reason).append("No of Days", days).append("From", from).append("To", to).append("Date and Time of Submission", today);
        //Inserting doc to collection
        collection.insert(doc);
       
        client.close();
        
    }
}
