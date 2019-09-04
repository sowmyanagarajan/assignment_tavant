package day1;

public class HelloWorld {
	public String GetString()
	{
		String string="hello world!!!";
		return string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hw=new HelloWorld();
		String resultString=hw.GetString();
		System.out.println(resultString);
		}
	}
