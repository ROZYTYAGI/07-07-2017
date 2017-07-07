package second;
import java.io.*;


public class Example {
	public static void main(String a[])
	{
		FileInputStream fis =null;
		//try {
			fis=new FileInputStream("d:/myfile.txt");
			int k;
			while((k = fis.read())!= -1)
			{
				System.out.println((char)k);
			}
	//	} //catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
		fis.close();
	}

}
