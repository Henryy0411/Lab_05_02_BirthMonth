public class BirthMonth {
    public static void main(String[] args) {
        int birthMonth = 13;

        if ( birthMonth < 1 ){
            System.out.println("You entered an incorrect month value");
        } else if ( birthMonth > 12 ) {
            System.out.println("You entered an incorrect month value");
        } else {
            System.out.println("Your birth month is : " + birthMonth);
        }
    }
}
