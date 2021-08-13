import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        String firstMetric = scanner.next().toLowerCase();
        String secondMetric = scanner.next().toLowerCase();
        double res =0 ;

        if (firstMetric.equals("mm")){
           res= distance / 1000;
        }

         else if (firstMetric.equals("cm")){
             res= distance / 100;
        }

        else  if (firstMetric.equals("mi")){
             res= distance / 0.000621371192;
        }

        else if (firstMetric.equals("in")){
             res= distance / 39.3700787;
        }

        else if (firstMetric.equals("km")){
             res= distance / 0.001;
        }

        else if (firstMetric.equals("ft")){
             res=  distance / 3.2808399;
        }

        else  if (firstMetric.equals("yd")){
             res= distance / 1.0936133;
        }


        if (secondMetric.equals("mm")){
            res= res * 1000;
        }

        else   if (secondMetric.equals("cm")){
             res= res * 100;
        }

        else  if (secondMetric.equals("mi")){
             res= res * 0.000621371192;
        }

        else  if (secondMetric.equals("in")){
             res= res * 39.3700787;
        }

        else  if (secondMetric.equals("km")){
             res= res * 0.001;
        }

        else  if (secondMetric.equals("ft")){
             res= res * 3.2808399;
        }

        else  if (secondMetric.equals("yd")){
             res= res * 1.0936133;
        }

        System.out.println(res);
    }
}
