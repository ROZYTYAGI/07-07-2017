package second;

public class TestRunTimeexception {


public static void main(String a[])throws Exception
{
try(MyAutoClosable close=new MyAutoClosable()){
	doCalculation();
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Array has only two elements");
	throw new MyRunTimException("Custom Exception");
}catch(MyRunTimException e) {
	e.printStackTrace();
}
finally
{
	System.out.println("this is finally block");
}

}
public static void doCalculation()throws ArrayIndexOutOfBoundsException
{
	int arg[]=new int[2];
	System.out.println(arg[3]);
}


}
