
import java.util.Scanner;

public class Conditional24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distanceMiles = sc.nextDouble();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();
        String weatherCondition = sc.nextLine();

        double baseFee = 3.0;
        double distanceSurcharge = distanceMiles * 1.0;
        double peakTime = 0.0;
        double weather = 0.0;
        double discount = 0.0;

       
        if(timeSlot.equals("Breakfast")) {
            peakTime = 0.0;
        } 
        else {
            if(timeSlot.equals("Lunch")) {
                peakTime = 2.5;
            } 
            else {
                if(timeSlot.equals("Dinner")) {
                    peakTime = 2.0;
                } 
                else {
                    if(timeSlot.equals("Late-Night")) {
                        peakTime = 1.5;
                    }
                }
            }
        }

        
        if(weatherCondition.equals("Clear")) {
            weather = 0.0;
        } 
        else {
            if(weatherCondition.equals("Rain")) {
                weather = 2.0;
            } 
            else {
                if(weatherCondition.equals("Snow")) {
                    weather = 3.0;
                } 
                else {
                    if(weatherCondition.equals("Storm")) {
                        weather = 5.0;
                    }
                }
            }
        }

        
        if(orderValue >= 30 && orderValue < 50) {
            discount = 1.0;
        }
        else {
            if(orderValue >= 50 && orderValue < 75) {
                discount = 3.0;
            }
            else {
                if(orderValue >= 75) {
                    discount = 5.0;
                }
            }
        }

        double finalFee = baseFee + distanceSurcharge + peakTime + weather - discount;

        if(finalFee < 2.99) {
            finalFee = 2.99;
        }

        
        int time = (int)(distanceMiles * 8);

        if(timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            time = time + 10;
        }

        if(weatherCondition.equals("Rain")) {
            time = time + 5;
        }
        else if(weatherCondition.equals("Snow")) {
            time = time + 10;
        }
        else if(weatherCondition.equals("Storm")) {
            time = time + 15;
        }

       
        String priority;

        if(orderValue > 60) {
            priority = "Express";
        }
        else {
            if(timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
                priority = "High";
            }
            else {
                priority = "Standard";
            }
        }

       
        System.out.println("Delivery Distance: " + distanceMiles + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weatherCondition);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + distanceSurcharge);
        System.out.println("Peak Time Surcharge: $" + peakTime);
        System.out.println("Weather Surcharge: $" + weather);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + time + " minutes");
        System.out.println("Service Priority: " + priority);

    }
}
