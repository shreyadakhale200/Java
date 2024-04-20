
public class CommandLineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0)
		{
			System.out.println("No Arguments are passed");
		}
		else {
			for(int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		}

	}

}

//run on commandline commands are
// javac CommandLineArguments.java
// java CommandLineArguments 10,20,30,40
