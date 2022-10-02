public class Insertion_Sort {
    public static void sortedarray(int array[]){
        int n= array.length;

        for (int j=1;j<n;j++){
            int key=array[j];
           int i=j-1;
           while(i>=0 && array[i]>key){
               array[i+1]=array[i];
               i=i-1;
           }
            array[i+1]=key;
        }
    }

}
