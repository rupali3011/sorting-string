import java.util.Scanner;
public class easy_sorting_string {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println("enter string");
        String str[] = new String[5];
        for(int i = 0; i < 5; i++)
        str[i] = sc.next();
        for(int i = 0; i < n-1; ++i) {  
            for (int j = i + 1; j < n; ++j) {  
                if (str[i].compareTo(str[j]) > 0) {  
                  String temp = str[i];  
                  str[i] = str[j];  
                  str[j] = temp;  
                  }  
              }  
          } 
          for(int i = 0; i < n; i++) {  
              System.out.print(str[i] + " ");  
          }   
          sc.close();
}

}