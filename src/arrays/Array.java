package arrays;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Array {
    public static void main(String args[]){

        String[] names = {"Jone", "Meena", "Doe", "anne", "elza"};

        //output meena
        System.out.println(names[1]);

        //change an array element
        names[0] = "Ishani";
        System.out.println(names[0]);

        //array length
        System.out.println(names.length);

        //

    }
}
