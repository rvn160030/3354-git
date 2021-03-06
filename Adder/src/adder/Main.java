package adder;

public class Main {

    public static void main(String[] args) {
        try {
            if(args.length == 0){ throw new IllegalArgumentException();}
            int result = addArguments(args);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            if(args.length == 0){
		System.err.println("Please provide at least 2 integers");
	    }
	    else{
	    System.err.println("Please provide only integer arguments,"
		+ " except \"-\" option to indicate negative addition");
    	    }
	}
    }

    private static int addArguments(String[] args) {
        int output = 0;
	if(args[0].equals("-")){
		for(int i = 1; i < args.length; i++){
			output-= Integer.valueOf(args[i]);
		}
	}
	else {
		for(int i = 0; i < args.length; i++){
			output+= Integer.valueOf(args[i]);
		}
	}
	return output;
    }
}
