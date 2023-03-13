package Sceduller;
import io.quarkus.logging.Log;
import io.quarkus.scheduler.Scheduled;
import javax.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class TestScheduller {
    int data = 0;
    //@Scheduled(every = "5s")

    public void everySecond(){
        data = data+1;
        Log.info("every SECONd = "+ data);
    }
}
/*
|--------------(Second 0-59)
| |-------------------(Minute 0-59)
| | |------------------------(Hour 0-23)
| | | |---------------------------(Day of the month 1-31)
| | | | |--------------------------------(Month 1-2) or (JAN-DEC)
| | | | | |-----------------------------------(Day of the week 0-7)
* * * * * *
 */
