import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStep {

    public static void insertSortByStep(int [] list,int size){

        for (int i=1;i<list.length;i++){

            int key;
            int currentMin =list[i];

            for ( key =i-1;key>=0 && list[key]>currentMin;key--){
                System.out.println("Swap "+list[key+1]+" to "+list[key]);
                list[key+1] =list[key];
            }
            list[key+1] =currentMin;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size :");
        int size = scanner.nextInt();

        int []list =new int[size];
        for (int i =0;i<size;i++){
            System.out.println("Enter a element "+i+" :");
            list[i] =scanner.nextInt();
        }

        System.out.println(Arrays.toString(list));
        System.out.println("=====================");

        insertSortByStep(list,size);
        System.out.println(Arrays.toString(list));
    }
}
