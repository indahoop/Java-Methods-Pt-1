import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class MilkPails {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("pails.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));
    String[] s = br.readLine().split(" ");
    int[] pails = new int[3];
    
    for (int i =0; i < 3; i++){
      pails[i] = Integer.parseInt(s[i]);
    }
    
    int x = pails[0];
    int y = pails[1];
    int m = pails[2];
    
    int maxX = m/x;
    int close = 0;
    
    for (int i =0; i < maxX +1 ; i++){
      int temp, rem;
      rem = (int) (m - (i*x))/y;
      temp = (i*x) + rem*y;
      if( temp > close){
        close = temp;}
    }
    
    pw.println(close);
    pw.close();
  }
}

