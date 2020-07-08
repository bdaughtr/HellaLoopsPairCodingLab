package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String value = "";

        for(int i=1; i<5+1; i++){
            for( int j=1; j<=5; j++){
                value = value + String.format("%3d |",i*j);
            }
            value = value + String.format("\n");
        }
        return value;
    }

    public static String getLargeMultiplicationTable() {
        String value = "";

        for (int i = 1; i < 10 + 1; i++) {
            for (int j = 1; j <= 10; j++) {
                value = value + String.format("%3d |", i * j);
            }
            value = value + String.format("\n");
        }
        return value;
    }
    public static String getMultiplicationTable(int tableSize) {
        //String [] multiTable = new String[tableSize];
        String value = "";

        for(int i=1; i<tableSize+1; i++){
            for( int j=1; j<=tableSize; j++){
                value = value + String.format("%3d |",i*j);
            }
            value = value + String.format("\n");
        }
        return value;
    }
}
