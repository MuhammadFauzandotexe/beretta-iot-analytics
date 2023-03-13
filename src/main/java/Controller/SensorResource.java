package Controller;
import Model.Channel;
import Model.Sensor;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("updateSensor")
public class SensorResource {
    @GET
    public List<Sensor> getData(){
        return Sensor.listAll();
    }
    @POST
    @Transactional
    @Path("{apikey}")
    public Sensor addSensor(@PathParam("apikey")String apikey, Sensor sensor){
        Channel channel = Channel.findById(apikey);
        channel.sensorList.add(sensor);
        sensor.persist();
        return sensor;
    }
}
