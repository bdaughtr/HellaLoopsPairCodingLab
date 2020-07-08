package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
    //GET ODD
        String value = "";
        if(start%2 == 1){
            for(int i=start; i<stop; i+=2)
                value = value += i;
        }else{
            for(int i=start+1; i<stop; i+=2)
                value = value +=i;
        }
        return value;
    }


    public static String getOddNumbers(int start, int stop) {
        //GET EVEN
        String value = "";
        if(start%2 == 0){
            for(int i=start; i<stop; i+=2)
                value = value += i;
        }else{
            for(int i=start+1; i<stop; i+=2)
                value = value +=i;
        }
        return value;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String value = "";

        for(int i=start; i<stop; i+=step){
            value = value += i*i;
        }
        return value;
    }

    public static String getRange(int start) {
        String value = "";

        for(int i=0; i<start; i++){
            value = value += i;
        }
        return value;
    }

    public static String getRange(int start, int stop) {
        String value = "";

        for(int i=start; i<stop; i++){
            value = value += i;
        }
        return value;
    }


    public static String getRange(int start, int stop, int step) {
        String value = "";

        for(int i=start; i<stop; i+=step){
            value = value += i;
        }
        return value;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String value ="";
        double product;

        for(int i=start; i<stop; i+=step){
            product = Math.pow(i, exponent);//integers are squared into doubles
            int temp = (int)product;//convert double to int
            value = value + temp;//concatenate integer into a string
        }
        return value;
    }
}
