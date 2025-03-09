package arrays;

public class LowestInt {

    public static void main(String args[]){
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        int length = ages.length;

        int lowest = ages[0];

        for(int age : ages){

            if(lowest > age){
               lowest = age;
            }

        }
        System.out.println(lowest);
    }

}
