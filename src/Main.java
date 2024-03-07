//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        float earthWeightDuwa = 83F;
        float marsWeightDuwa;
        double dubWeightDuwa;
        int marsWeightIntDuwa;

// converting earth weight to  Mars weight
        marsWeightDuwa = (earthWeightDuwa * 0.38F);

        System.out.println(earthWeightDuwa+ " Kg is my weight on earth "+ " and "+marsWeightDuwa+" is my weight on mars ");
        // converting weight to double
        dubWeightDuwa = marsWeightDuwa;
        System.out.println("Kilograms  on Mars after converting  to double "+ dubWeightDuwa);
        //converting weight to four decimal places
        String fourdp = String.format("%.4f", dubWeightDuwa);
        System.out.println("Kilograms on Mars displayed to four decimal places :  "+fourdp);
        // casting weight on Mars to integer
        marsWeightIntDuwa = (int) dubWeightDuwa;
        System.out.println("Kilograms on Mars when casted to integer  "+marsWeightIntDuwa);
        char asciiEquivalent = (char) marsWeightIntDuwa;
        System.out.println("The ASCII equivalent of marsWeightInInt is : "+asciiEquivalent);
        System.out.println("An example of a mathematical operation on the char type : 961 ");







    }
}