
def rank = [1,2,3,4,5,6,7,8,9,10,"J","Q","K"];

def suit = ["Spades", "Hearts", "Diamonds", "Clubs"];



def deck = [];

def hand = [];

def handParts = [];



for(int i = 0; i < suit.size(); i++){
	
	for(int j=0; j< rank.size(); j++){
		
	deck.add(rank[j]+"-"+suit[i]);
	
	}

}


for(int k = 0; k < 5; k++){

	def randomCard = deck.get(new Random().nextInt(deck.size()))

	hand.add(randomCard);

}

for(int l = 0; l < hand.size(); l++){

	 
	 handParts.add(hand[l].split("-"));

}

def handRank =[];

def handSuit =[];


for(int m = 0; m < handParts.size(); m++){

		handRank.add((handParts[m])[0]);
		handSuit.add((handParts[m])[1]);

}


//println rank;
//println suit;
//println deck;
//println deck.size()
println hand;
println handParts;
println handRank;
println handSuit;
println handRank.sort(false);
println deck.sort(false);

def cleanedHandRank =[];

boolean b = handRank[0] instanceof Integer;
println handRank[0];
println b;

for(int n = 0; n < handRank.size(); n++){
	
	if (handRank[n] != "J" && handRank[n] != "Q" && handRank[n] != "K"){  
	
		cleanedHandRank.add(Integer.parseInt(handRank[n]));
	
	} else if (handRank[n] == "J" || handRank[n] == "Q" || handRank[n] == "K"){
		
		cleanedHandRank.add(handRank[n]);
	
	}


}

cleanedHandRank.sort()

println cleanedHandRank;


// straight flush

	
	//if (handSuit[0] == "Spades" && handSuit[1] == "Hearts" || handSuit[1] == "Diamonds" ||
	//	handSuit[4] == "Clubs"){

	//	println "all";
	
	//}

//}



