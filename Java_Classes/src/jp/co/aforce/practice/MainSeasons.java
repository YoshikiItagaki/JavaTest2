package jp.co.aforce.practice;

public class MainSeasons {

	public static void main(String[] args) {
		for(Season season: Season.values()) {
			System.out.println(season.toString());
		}
	}

}

//values()
//With this method, we can comprehensively process enumerated values.
//The method is frequently used alongside a for-each loop.
