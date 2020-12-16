public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean sorted=false;
    if(data.length<=1) sorted=true;
    // int n=data.length;
    // for(int i=0; i<n; n--){
    for(int n=data.length; n>0; n--){
      if(sorted) n=0;
      else for(int i=0; i<n-1; i++){
        if(data[i]>data[i+1]){

        }
      }
    }
  }

}
