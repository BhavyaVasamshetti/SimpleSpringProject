package springpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        TravelBookingService bookingService = (TravelBookingService) context.getBean("travelBookingService");
        
        System.out.println("Travelling by Bus " );
        System.out.println("Travelling by Train " );
        System.out.println("Travelling by Flight " );




        System.out.println("Total Cost for travel in flight: " + bookingService.getCost());
        System.out.println("Total Hours: " + bookingService.getTotalHours() + " hours");
        



    }
}
