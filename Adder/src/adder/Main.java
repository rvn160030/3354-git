package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide some integers to add, use \"-\""
		+ " to add as negative integers");
        }
    }

    private static int addArguments(String[] args) {
        int output = 0;
	if(args[0].equals("-")){
		//System.out.println("Negative addition");
		for(int i = 1; i < args.length; i++){
			output-= Integer.valueOf(args[i]);
		}
	}
	else {
		for(int i = 0; i < args.length; i++){
			//System.out.println("Positive Addition");
			output+= Integer.valueOf(args[i]);
		}
	}
	return output;
    }
}
