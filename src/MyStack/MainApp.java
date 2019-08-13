package MyStack;

public class MainApp {

   public static void main(String[] args) {//throws Exception //이오류를 다른데서 호출한다.
      try {
         MyStack<String> stack = new MyStack<String>(3);
         stack.push("Hello");
         stack.push("World");
         stack.push("!!!");
         stack.push("java");
         stack.push(".");

         while (stack.isEmpty() == false) {
            String s = stack.pop();
            System.out.println( s );
         }

         System.out.println("======================================");

         stack = new MyStack<String>(3);
         stack.push("Hello");

         System.out.println(stack.pop());
         System.out.println(stack.pop());
         
      } catch ( MyStackException ex) {
         System.out.println( ex );
      }

   }

}