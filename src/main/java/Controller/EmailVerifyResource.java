package Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
@Path("verify")
public class EmailVerifyResource {
    @GET
    @Path("{userdata}")
    public String verify(@PathParam("userdata")String userdata){
        String status = null;
        Base64.Decoder decoder = Base64.getDecoder();
        String dStr = new String(decoder.decode(userdata));
        String stg = dStr;
        List<String> mydata = new ArrayList<>();
        String[] spStg = stg.split("&=");
        for (String i: spStg) {
            mydata.add(i);
        }
        String idUser = mydata.get(0);
        String email = mydata.get(1);
        String username = mydata.get(2);
        return idUser+"  "+email+"  "+username;
    }
}
