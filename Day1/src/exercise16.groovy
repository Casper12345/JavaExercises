
def RsP = ["r","s","p"];

int playerScore = 0;
int computerScore = 0;

boolean flag = false;


while(!flag){

	print "Player choose(PRS): ";
	String playerInput = System.console().readLine();

	if (playerInput == "p" || playerInput == "r" || playerInput == "s"){
	
		def randomHand = RsP.get(new Random().nextInt(RsP.size()));

			if (playerInput == "p" && randomHand == "p"){
	
				println "Draw";
	
			} else if (playerInput == "p" && randomHand == "r"){
				
				println "Player Wins";
				playerScore ++;
				println "P: " + playerScore;
				println "C: " + computerScore;
		
			} else if (playerInput == "p" && randomHand == "s"){
		
				println "Computer Wins";
				computerScore ++;
				println "P: " + playerScore;
				println "C: " + computerScore;
				
		
			} else if (playerInput == "r" && randomHand == "p"){
		
				println "Computer Wins";
				computerScore ++;
				println "P: " + playerScore;
				println "C: " + computerScore;
		
			} else if (playerInput == "r" && randomHand == "r"){
		
				println "Draw";
				println "P: " + playerScore;
				println "C: " + computerScore;
			
			} else if (playerInput == "r" && randomHand == "s"){
			
				println "Player Wins";
				playerScore ++;
				println "P: " + playerScore;
				println "C: " + computerScore;
		
			} else if (playerInput == "s" && randomHand == "p"){
		
				println "Player Wins";
				playerScore ++;
				println "P: " + playerScore;
				println "C: " + computerScore;
			
		
			} else if (playerInput == "s" && randomHand == "r"){
			
				println "Computer Wins";
				computerScore ++;
				println "P: " + playerScore;
				println "C: " + computerScore;
		
			} else if (playerInput == "s" && randomHand == "s"){
		
				println "Draw";
				println "P: " + playerScore;
				println "C: " + computerScore;
		
			}


		} else {

			println "Wrong Command";
			flag = true;
	
		}	

	if ((playerScore - 3) == computerScore ||
	   	(computerScore -3) == playerScore){
		
			flag = true;
		}
	

	
}

if (playerScore > computerScore){
	
	println " ";
	println "The Winner of the Game is: Player";
	
	println "Final Score: ";
	println "Player: "+ playerScore;
	println "Computer: " + computerScore;
	
	
} else {
	
	println " ";
	println "The Winner of the Game is: Computer";

	println "Final Score: ";
	println "Player: "+ playerScore;
	println "Computer: " + computerScore;
} 







 

