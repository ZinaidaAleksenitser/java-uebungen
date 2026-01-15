public class missingCharecter {

    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
    }

    public static String missingChar( String str, int n){

        if(n<str.length() && !str.isEmpty()){

        String begin = str.substring(0, n);
        String end = str.substring(n+1, str.length());

        return begin+end;
        }
        else return "an error occured";

    }

    
}
