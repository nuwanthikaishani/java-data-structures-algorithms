package sortingalgorithms;

public class BubbleSortDes {

    public static void main(String args[]){
        int[] arr = {5, 2, 8, 1, 3};

        for (int i =0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length -1 - i; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.print("Descending order : ");
        for(int desNum : arr){
            System.out.print(desNum+ " , ");
        }
    }
}
