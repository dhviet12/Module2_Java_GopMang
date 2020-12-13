import java.util.Arrays;

public class ConnectTwoArrays {
    public static void main(String[] args) {
        int arr1[]={1,1,1,1};
        int arr2[]={0,3};
        int newArr[]= ConnectArray(arr1,arr2);
        System.out.println("Array1: "+ Arrays.toString(arr1));
        System.out.println("Array2: "+ Arrays.toString(arr2));
        System.out.println("Array3: "+ Arrays.toString(newArr));


    }
    static int[] ConnectArray(int array1[], int array2[]){
        int newArray[]= new int[array1.length+array2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array1.length) {
                newArray[i] = array1[i];
            } else
                newArray[i]=array2[i-array1.length];
        }
        return newArray;
    }
}
