import java.util.List;
import java.util.Scanner;

/**
 * Created by Usama Tahir on 4/11/2017.
 */
public class Main {
    public static void main(String[] args)
    {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        List<persistantClass> l = data.getData();
        int choice =0;
        m.printStatements();
        choice = in.nextInt();
        while (choice!=-1)
        {
            switch (choice)
            {
                case 1:
                    System.out.print("Search City: ");
                    String city = in.next();
                    for (int i=0;i<l.size();i++)
                    {
                        if(l.get(i).getCity().equals(city))
                        {
                            System.out.println("Latitude: "+l.get(i).getLatitude());
                            System.out.println("Longitude "+l.get(i).getLongitude());
                            in.nextLine();
                            break;
                        }
                    }
                    break;
                case 2:
                    String city1;
                    String city2;
                    city1 = in.next();
                    city2 = in.next();
                    double x1 = m.getlatitude(city1,l);
                    double y1 = m.getLongitude(city1,l);
                    double x2 = m.getlatitude(city2,l);
                    double y2 = m.getLongitude(city2,l);
                    m.calculateCircularDistance(x1,y1,x2,y2);

                    break;


            }
            m.printStatements();
            choice = in.nextInt();
        }
        System.exit(0);


    }
    public double calculateCircularDistance(double x1, double y1, double x2, double y2)
    {
        double angle1 = Math.acos(Math.sin(x1)* Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
        angle1 = Math.toDegrees(angle1);
        double Distance = 60* angle1;
        System.out.println(Distance+ " nautical miles");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        return Distance;
    }
    public double getlatitude(String city,List<persistantClass> l)
    {
        double x1 = 0;
        for (int i =0;i<l.size();i++)
        {
            if(l.get(i).getCity().equals(city))
            {
                x1 = Math.toRadians(Double.parseDouble(l.get(i).getLatitude()));
                break;
            }
        }
        return x1;
    }

    public double getLongitude(String city,List<persistantClass> l)
    {
        double x1 =0;
        for (int i =0;i<l.size();i++)
        {
            if(l.get(i).getCity().equals(city))
            {
                x1 = Math.toRadians(Double.parseDouble(l.get(i).getLongitude()));
                break;
            }
        }
        return x1;
    }
    public void printStatements()
    {
        System.out.println("Welcome to City Search");
        System.out.println("Press 1 for Latitude and Longitude\n" +
                "Press 2 for Distance btw 2 cities\n" +
                "Press -1 to terminate program");
    }
}
