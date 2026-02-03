import java.io.*;
import java.util.*;

public class wizards_trolleybuses {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        double a = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());

        double[] arrival = new double[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            double t = Double.parseDouble(st.nextToken());
            double v = Double.parseDouble(st.nextToken());

            // time to reach max speed
            double tToV = v / a;
            double distAccel = v * v / (2 * a);

            double travelTime;

            if (distAccel >= d) {
                // never reaches max speed
                travelTime = Math.sqrt(2 * d / a);
            } else {
                // reaches max speed
                travelTime = tToV + (d - distAccel) / v;
            }

            arrival[i] = t + travelTime;

            // cannot arrive before previous trolley
            if (i > 0) {
                arrival[i] = Math.max(arrival[i], arrival[i - 1]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (double x : arrival) {
            sb.append(String.format(Locale.US, "%.10f\n", x));
        }

        System.out.print(sb.toString());
    }
}
