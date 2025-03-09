package arrays;

public class Highest {
    public static void main(String args[]){
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        int highest = ages[0];

        for (int age : ages){
            if (highest < age){

                highest = age;

            }
        }

        System.out.println(highest);
    }
}
