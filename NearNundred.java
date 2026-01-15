public class NearNundred {

    public static void main(String[] args) {

        nearHundred(95); 
        System.out.println(nearHundred(190));
    }

   public static boolean nearHundred(int n){

        if (n>=(100-10) && n<=(100+10)){
            return true;             
        }
        else return false;
    }
    
}
