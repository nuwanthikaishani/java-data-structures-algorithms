package arrays;

public class ArrayLoop {
    public static void main(String args[]){

        String[] names = {"Jone", "Meena", "Doe", "anne", "elza"};

        //using for loop
        for (int i=0; i< names.length;i++){
            System.out.println(names[i]);
        }

        System.out.println("====================");
        System.out.println("Loop arry with for each");
        //Loop arry with for each
        for (String namelist : names){
            System.out.println(namelist);

        }
        System.out.println("====================");
        System.out.println("");


    }
}
