import java.util.Arrays;
public class MethodAssignment {
    public static int[] addvalue(int[] array, int value){
        int[] array2 = new int [11];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array2[array.length] = value;
        return array2;
    }
    public static int[] deletevalue(int[] array, int value){
        int[] array3 = new int [9];
        for (int i = 0; i < array.length-1; i++) {
            array3[i] = array[i];
        }
        return array3;
    }
    public static int[] insertvalue(int[] array, int value, int pos){
        int[] array4 = new int [11];
        for (int i = 0; i < pos+1; i++) {
            array4[i] = array[i];
        }
        array4[pos] = value;
        for (int i = pos+1; i < array.length+1; i++) {
            array4[i] = array[i-1];
        }
        return array4;
    }
    public static void main(String[] args) {
        int[] ogarray = new int [10];
        for (int i = 0; i < 10; i++) {
            ogarray[i] = i;
        }
        int[] array = new int [10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }

        int value;
        int pos;

        value = 10;
        pos = 7;

        System.out.println(Arrays.toString(array));
        array=addvalue(array, value);
        System.out.println(Arrays.toString(array));
        array=ogarray;
        System.out.println("The value \'" + value + "\' has been added to the end of the array");

        System.out.println("");
        System.out.println(Arrays.toString(array));
        array=deletevalue(array, 10);
        System.out.println(Arrays.toString(array));
        System.out.println("The last value has been removed from the end of the array");
        array=ogarray;


        System.out.println("");
        System.out.println(Arrays.toString(array));
        array=insertvalue(array, value,pos);
        System.out.println(Arrays.toString(array));
        System.out.println("The value \'" + value + "\' has been inserted into the seventh position");
    }
}