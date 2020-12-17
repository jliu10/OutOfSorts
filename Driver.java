import java.util.Arrays;
public class Driver{

  public static void main(String[]args){
    //args 0 must be size of the Array
    //args 1 must be "bubble" or "test" (unless you add more)
    int[] randData = new int[Integer.parseInt(args[0])];

    for(int i = 0 ; i < randData.length; i++){
      randData[i] =(int)(Math.random()*10000);
    }

    switch(args[1]){
      case "bubble": Sorts.bubbleSort(randData);
        break;
      case "selection": Sorts.selectionSort(randData);
        break;
      case "insertion": Sorts.insertionSort(randData);
    }

    if(args.length>2){
      int[] randDataTest = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.bubbleSort(randDataTest);
      switch(args[1]){
        case "bubble": Sorts.bubbleSort(randDataTest);
          break;
        case "selection": Sorts.selectionSort(randDataTest);
          break;
        case "insertion": Sorts.insertionSort(randDataTest);
      }
      if(Arrays.equals(randData,randDataTest)){
        System.out.println("Sort Correct!");
      }else{
       System.out.println("Sort Not Correct!!!!!!!!!11oneeleven");
      }
    }
  }
}
