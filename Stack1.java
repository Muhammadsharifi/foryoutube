import java.util.Stack;
import java.util.Scanner;

public class Stack1 {
  int size;
  String array[];
  int top;
    public Stack1(int size){
    this.size = size;
    this.array = new String[size];
    this.top = -1;

  }
  public boolean isFul(){
    return (size-1==top);

  }
  public boolean isEmpty(){
    return (top == -1);
  }
    public String peek(){
    return array[top];
  }
  public void push(String cities){
    if(!isFul()){
      array[++top] = cities;
      System.out.println("Cities Pushed: "+ cities);
    }else{
      System.out.println("Stack is full: ");

    }
  }
  public String pop(){
    if(!isEmpty()){
      String val = array[top];
      top--;
      System.out.println(" popped City is: "+ val);
      return val;

    }else{
      System.out.println("Stack is empty");
      return String.valueOf(-1);
    }
  }


  public static void main(String[] args){
  Stack<String> stack = new Stack<String>();
  String cities[] = {"Philadelphi,PA", "Harrisburg,PA", "Pittsburg,PA", "Cleveland,OH","Toledo,OH","Gary,IN", "Chicago,IL"};
    for (int i=0; i < cities.length; i++){
      stack.push(cities[i]);
    }
  System.out.println("City name added ot stack" + stack);
  while(!stack.isEmpty())
  {
    System.out.print(stack.pop() + " ");
  }
  System.out.println("\n");

  
  }

}
