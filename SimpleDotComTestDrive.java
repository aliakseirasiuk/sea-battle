public class SimpleDotComTestDrive{
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();

		int[] locations = {2,3,4};

		dot.setLocationCells(locations);
		String userGuess = "2";

		String result = dot.checkYourself(userGuess);

		String testResult = "Test Failed";
		if(result.equals("Hit")){
			testResult = "Test Passed";
		}

		System.out.println(testResult);
	}
}