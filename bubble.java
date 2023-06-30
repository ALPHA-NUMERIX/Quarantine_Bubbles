package bubbles;
import java.io.*;

public class bubble{

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String CasePlaces = "";
        String ECQplaces = "";
        String GCQplaces = "";
        String MGCQplaces = "";
        System.out.println("Quarantine/Covid plus Bubble");
        System.out.println("Area 1 - NCR");
        System.out.println("Area 2 - Cavite");
        System.out.println("Area 3 - Laguna");
        System.out.println("Area 4 - Bulacan");
        System.out.println("Area 5 - Rizal");

        for(int i =1; i<=5; i++){
            System.out.print("How many covid person in your area " + i + ": ");
            int casenumber = Integer.parseInt(br.readLine());
            switch 	 (i) {
                case 1:
                    CasePlaces = "NCR";
                    break;
                case 2:
                    CasePlaces = "Cavite";
                    break;
                case 3:
                    CasePlaces = "Laguna";
                    break;
                case 4:
                    CasePlaces = "Bulacan";
                    break;
                case 5:
                    CasePlaces = "Rizal";
                    break;
                default:
                    break;
            }

            if(casenumber >= 100){
                ECQplaces = ECQplaces + CasePlaces + " ";
            }
            else if(casenumber >= 20 && casenumber <= 99){
                GCQplaces += CasePlaces + " ";
            }
            else if(casenumber >= 0 && casenumber <= 19){
                MGCQplaces += CasePlaces + " ";
            }

        }
        System.out.println("Under ECQ is/are : " + ECQplaces);  
        System.out.println("Under GCQ is/are : " + GCQplaces);
        System.out.println("Under MGCQ is/are : " + MGCQplaces);
    }
}