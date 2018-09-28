package drivers;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class feedbackupload {
    Object rno,name,feedback;
    public feedbackupload(String rno, String name, String feedback){
        this.rno = rno;
        this.name = name;
        this.feedback = feedback;
        
    }
    private final static String HOST = "localhost";
    private final static int PORT = 27017;
   
    public void upload(){
        //Create connection with MongoDB server
        MongoClient client = new MongoClient( HOST, PORT);
        //Connecting to Login database
        DB db = client.getDB("III");
        //Getting respective collection
        DBCollection collection = db.getCollection("Feedback");
        //Creating an object to insert
        DBObject doc = new BasicDBObject("Reg No",rno).append("Name", name).append("Feedback", feedback);
        //Inserting doc to collection
        collection.insert(doc);
       
        client.close();
    }
    
}
