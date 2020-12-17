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
    for(int n=data.length; n>1; n--){
      boolean madeSwap=false;
      if(sorted) n=0;
      else for(int i=0; i<n-1; i++){
        if(data[i]>data[i+1]){
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

  public static void selectionSort(int[] data){
    for(int i=0;i+1<data.length;i++){
      int small=i;
      for(int j=i;j+1<data.length;j++){
        if(data[j]<data[small]) small=j;
      }
      if(data[data.length-1]<data[small]) small=data.length-1;
      if(small!=i) swap(data,small,i);
    }
  }

  public static void insertionSort(int[] data){
    for(int i=0;i<data.length;i++){
      int index=i;
      for(int j=i-1;j>=0;j--){
        if(data[i]>data[j]) j=-1;
        else index--;
      }
      if(index!=i) swap(data,i,index);
    }
    /*
    int index=0;
    for(int i=0;i<size();i++){
      if(element.compareTo(get(i)) > 0) {
        index++;
      } else i=size();
    }
    swap(data,i,j);
    */
  }


}
