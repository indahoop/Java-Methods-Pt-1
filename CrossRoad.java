import java.io.*;
import java.util.*;
import java.util.Arrays.*;


public class CrossRoad {
  public static void main(String[] args) throws IOException{
    //Reader, takes format and puts it into 2 corresponding arrays of arrival time of cow and answer time of specfic cow
    BufferedReader br = new BufferedReader(new FileReader("cowqueue.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowqueue.out")));
    int cows = Integer.parseInt(br.readLine());
    int[] arrTime = new int[cows];
    int[] ansTime = new int[cows];
    for (int i = 0; i < cows; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      arrTime[i] = Integer.parseInt(st.nextToken());
      ansTime[i] = Integer.parseInt(st.nextToken());
    }
    
    
    int currentTime = 0;
    int index=0;
    int[] sortedArr = Arrays.copyOf(arrTime,cows);
    Arrays.sort(sortedArr);
    for (int k = 0; k < cows; k ++){
      for (int i =0; i < cows; i++){
        if (sortedArr[k] == arrTime[i]){
          index = i;
          break;
        }
      }
      if (k == 0){
        currentTime = arrTime[index] + ansTime[index];
      }
      else {
        if(arrTime[index] > currentTime){
          currentTime = arrTime[index] + ansTime[index];
        }
        else{
          currentTime = currentTime + ansTime[index];
        }
      }
    }
    pw.println(currentTime);
    pw.close();
    System.out.println(currentTime);
    

  }
}


    
      
    
  