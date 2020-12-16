public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void swap(int[] data,int a,int b){
      int t=data[a];
      data[a]=data[b];
      data[b]=t;
  }

  public static void bubbleSort(int[] data){
    boolean sorted=false;
    if(data.length<=1) sorted=true;
    // int n=data.length;
    // for(int i=0; i<n; n--){
    for(int n=data.length; n>1; n--){
      boolean madeSwap=false;
      if(sorted) n=0;
      else for(int i=0; i<n-1; i++){
        if(data[i]>data[i+1]){
          // int t=data[i];
          // data[i]=data[i+1];
          // data[i+1]=t;
          swap(data,i,i+1);
          madeSwap=true;
        }
      }
      if(!sorted && data[n-2]>data[n-1]){
        swap(data,n-2,n-1);
        madeSwap=true;
      }
      if(!madeSwap) sorted=true;
    }
  }

}
