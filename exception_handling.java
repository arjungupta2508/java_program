package java_2501;

public class java_test1 {
	
	public static void main(String[] args)
	{
		try {
			int a = 10;
			int b = 0;
			int result = a/b;
			System.out.println(result);
		    }
		  
		catch (ArithmeticException e)
		{
			 System.out.println("Cannot divide by zero");
		}
		
		try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Array index error!");
        }
		
		try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Error occurred!");
        } finally {
            System.out.println("Finally block executed always");
        }

     }
}
