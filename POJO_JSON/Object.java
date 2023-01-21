package JSON_POJO;

import java.io.File;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Object {
        private static ArrayList <Contacts> list = new ArrayList<>();
        private static ArrayList <String> phone_nos = new ArrayList<>(); 
        public static void main(String[] args) {
            phone_nos.add("7092944196");
            Contacts A = new Contacts("74400000000002009",
                                    "",
                                    "SBGP", 
                                    phone_nos, 
                                    "SBGP", 
                                    1670166893875L,
                                    "1360086",
                                    1672888164081L,
                                    "");
            ObjectMapper obj = new ObjectMapper();
            try{
                // System.out.println(obj.writeValueAsString(A));
                obj.writeValue(new File("D:\\SourceCode\\Java\\JSON_POJO\\JSON.json"), A);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
}
