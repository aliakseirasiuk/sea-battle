public class SimpleDotComGame{
	
	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();

		SimpleDotCom dotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);

		int[] locationCells = {randomNum, randomNum + 1, randomNum + 2};
		dotCom.setLocationCells(locationCells);
		boolean isAlive = true;
		
		while(isAlive){
			String guess = helper.getUserInput("Enter the number: ");
			String result = dotCom.checkYourself(guess);
			numOfGuesses++;
			if(result.equals("Ship sinked!")){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " turn(s) to win");
			}
		}
	}
}