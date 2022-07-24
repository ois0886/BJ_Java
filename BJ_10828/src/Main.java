import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    int num = sc.nextInt(); 
    
    for(int i = 0; i < num; i++) {
      String order = sc.next();
      
      switch (order) {
        case "push":
          stack.push(sc.nextInt());
          break;
        
        case "pop":
          if(stack.empty()) {
            System.out.println(-1);
          }
          else {
            System.out.println(stack.pop());
          }
          break;
          
        case "size":
          System.out.println(stack.size());
          break;
        
        case "empty":
          if(stack.empty()) {
            System.out.println(1);
          }
          else {
            System.out.println(0);
          }
          break;
          
        case "top":
          if(stack.empty()) {
            System.out.println(-1);
          } 
          else {
            System.out.println(stack.peek());
          }
          break;
      }
    }
  }
}