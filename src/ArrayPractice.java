import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        int onesnum = 0;
        int sum = 0;
        int pos = 0;
        int postwo = 0;
        int temp = 0;

        int[] array = new int[20];
        for(int i = 0; i < 20; i++){
            array[i] = (int)(Math.random() * 6) + 1;
            if(array[i] == 1){
                onesnum++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("There are " + onesnum + " \"ones\" in this array");

        int[] arraytwo = new int[10];
        for(int i = 0; i < 10; i++){
            arraytwo[i] = (int)(Math.random() * 100) + 1;
        }
        for(int i = 0; i < 10; i++){
            sum = sum + arraytwo[i];
        }
        System.out.println("");
        System.out.println(Arrays.toString(arraytwo));
        System.out.println("The average is " + sum/10.0 + " in this array");

        pos = (int)(Math.random() * 10);
        temp = arraytwo[pos];
        postwo = (int)(Math.random() * 10);
        while(postwo == pos){
            postwo = (int)(Math.random() * 10);
        }
        System.out.println("");
        System.out.println(Arrays.toString(arraytwo));
        arraytwo[pos] = arraytwo[postwo];
        arraytwo[postwo] = temp;
        System.out.println(Arrays.toString(arraytwo));
        System.out.println("Items " + pos + " and " + postwo + " changed places");

        int[] arraythree = new int[10];
        for(int i = 0; i < 10; i++){
            arraythree[i] = arraytwo[9-i];
        }
        System.out.println();
        System.out.println(Arrays.toString(arraytwo));
        arraytwo = arraythree;
        System.out.println(Arrays.toString(arraytwo));
        System.out.println("This array is backwards now");
    }
}
