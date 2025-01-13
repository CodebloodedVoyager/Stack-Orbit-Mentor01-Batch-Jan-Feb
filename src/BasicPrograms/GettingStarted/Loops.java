package BasicPrograms.GettingStarted;

public class Loops {
    public static void main(String[] args) {

//        Loops : WHile Looop & For Loop
//        Q : Print 1 to 9



//        WHile Loop
        int i = 1;
        //Initialization
        while(i <= 9){
            //Evaluation

            System.out.println(i);
            i++;
            //Increment
            // i = i + 1, increment is imp, otherwise it'll run infinitely (TLE)
        }
        System.out.println("Done");


//         For Loop
        for (int j = 1; j <= 9; j++){
            System.out.println(j);
        }
        System.out.println("This too !!");





    }
}
