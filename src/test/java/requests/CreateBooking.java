package requests;
import POJO.Booking;
import POJO.BookingDates;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.EndPoints;

public class CreateBooking {



    public static Booking createBookingData() {
        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2025-02-02");
        bookingDates.setCheckout("2025-03-15");


       Booking booking = new Booking();
        booking.setFirstname("John");
        booking.setLastname("Cena");
        booking.setDepositpaid(true);
        booking.setTotalprice(1920);
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Wine and pepsi");

        return booking;
    }
    public static   Response createnewBooking(){


        Response response= RestAssured.given()
                .baseUri(EndPoints.baseURI)
                .contentType(ContentType.JSON)

                .body(CreateBooking.createBookingData())

                .when()
                .post(EndPoints.CREATE_BOOKING);



        return response;



    }
}
