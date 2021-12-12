import java.io.*;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) throws Exception {
    FileReader reader = new FileReader("input.txt");
    BufferedReader br = new BufferedReader(reader);
    String data = null;
    int count=0;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    while ((data = br.readLine()) != null) 
    {
       int a= Integer.parseInt(data);
       arr.add(a);
    }
    int[] res=arr.stream().mapToInt(i -> i).toArray();
     for(int i=0;i<1999 ;i++){
       if(res[i]<res[i+1]){
         count=count+1;
      
       }
     } 
    System.out.println(count); 
    br.close();
  }
}