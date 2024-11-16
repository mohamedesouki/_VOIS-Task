package Task2;

import CSV_Data.ReadData;
import org.testng.annotations.Test;

public class TripTest extends BaseTest {

    @Test(dataProviderClass = ReadData.class,dataProvider = "stations")
    void completeTrip(String startStation,String destination){
    home.searchTrip(startStation,destination);
    trip.selectSeat();


}
}
