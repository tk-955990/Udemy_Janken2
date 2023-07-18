public class Referee {

	final String Hand_G = "グー";
	final String Hand_T = "チョキ";
	final String Hand_P = "パー";

	String name;

	Referee(String nm) {
		this.name = nm;
	}

	void startJanken(){

		messageReferee("じゃんけん。。。ぽん！！！");
	}

	void checkHand(Player p) {

		if( (p.handStatus).equals(Hand_G) ) {
			messageReferee(p.name + "さんの手はグーでした");

		}else if( (p.handStatus).equals(Hand_T) ) {
			messageReferee(p.name + "さんの手はチョキでした");

		}else if( (p.handStatus).equals(Hand_P) ) {
			messageReferee(p.name + "さんの手はパーでした");
		}else{
			System.out.println("[ERROR]じゃんけんの判定が不正です");
		}


	}


	void judgeJanken(Player p1,Player p2) {

		messageReferee("結果は。。。");


		if( (p1.handStatus).equals(p2.handStatus) ) {
			messageReferee("あいこ！　勝負つかず！");
		}else if (
				( (p1.handStatus).equals(Hand_G) && (p2.handStatus).equals(Hand_T) )
				|| ( (p1.handStatus).equals(Hand_T) && (p2.handStatus).equals(Hand_P) )
				|| ( (p1.handStatus).equals(Hand_P) && (p2.handStatus).equals(Hand_G) )
				) {
			messageReferee(p1.name + "さんの勝利！！");
		}else {
			messageReferee(p2.name + "さんの勝利！！");
		}

	}



	void messageReferee(String msg) {

		System.out.println(this.name + "『" + msg + "』");


	}









}

