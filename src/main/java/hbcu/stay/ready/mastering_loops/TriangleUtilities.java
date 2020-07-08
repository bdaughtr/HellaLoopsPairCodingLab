package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String value = "";

        for(int i=1;i<numberOfRows;i++){
            value += generateRow(i) + "\n";
        }
        return value;
    }

    private static String generateRow(int numOfStars){
        String value = "";

        for(int i=1; i<=numOfStars; i++){
            value += "*";
        }
         return value;
    }
    public static String getRow(int numberOfStars) {
        String value = "";

        for(int i=1; i<=numberOfStars; i++){
            value += "*";
        }
        return value;
    }

    public static String getSmallTriangle() {
        String value = "";

        for (int i = 1; i < 5; i++) {
            value += generateRow(i) + "\n";
        }
        return value;
    }

    public static String getLargeTriangle() {
        String value = "";

        for (int i = 1; i < 10; i++) {
            value += generateRow(i) + "\n";
        }
        return value;
    }
}
