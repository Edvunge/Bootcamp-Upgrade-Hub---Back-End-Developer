public class LoopsExercises {
    public static void main(String[] args) {



// *********************************************************************************************************************
// Print i as long as i is less than 6.


        int i = 1;
        while (i < 6) {
            System.out.println(i);
            i++;
        }




// *********************************************************************************************************************
// Use the do/while loop to print i as long as i is less than 6.


        int ii = 1;
        do {
            System.out.println(ii);
            ii++;
        } while (i < 6);




// *********************************************************************************************************************
// Use a for loop to print "Yes" 5 times:


        for (int iii = 0; iii < 5; iii++) {
            System.out.println(iii);
        }




// *********************************************************************************************************************
// Loop through the items in the cars array.


        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String iII : cars) {
            System.out.println(iII);
        }




// *********************************************************************************************************************
//        Stop the loop if i is 5.


        for (int iE = 0; iE < 10; iE++) {
            if (iE == 5) {
                break;
            }
            System.out.println(iE);
        }




// *********************************************************************************************************************
// In the loop, when the value is "4", jump directly to the next value.


        for (int iS = 0; iS < 10; iS++) {
            if (iS == 4) {
                break;
            }
            System.out.println(iS);
        }




// *********************************************************************************************************************
    }
}
