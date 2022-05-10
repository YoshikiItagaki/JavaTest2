package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PracticeTest3 {

	public static void main(String[] args) {

		//1.田中のデータ格納
		String[] tanaka_taro = {"1","田中太郎", "男性","27"};
		//2.田中太郎　出力
		System.out.println(tanaka_taro[1]);

		//3.上で社員クラス生成↑

		//4.aコレクションに社員データを全て格納
		Employee tanaka = new Employee(1,"田中太郎", "男性",27);
		Employee sato = new Employee(2,"佐藤花子", "女性",22);
		Employee suzuki = new Employee(3,"鈴木次郎", "男性",31);

		//番号は１，名前は田中太郎、年齢は27歳です。

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(0,tanaka);
		employees.add(1,sato);
		employees.add(2,suzuki);

		//4.b 拡張for文で全ての社員データを出力
		for(Employee employee: employees) {
			System.out.println("番号は"+ employee.getIdNumber()+",名前は"+ employee.getName()+", 年齢は"+ employee.getAge()+"です。\n");
		}

		//5. 国語　90点　数学80点　65点
		HashMap<String, String> scores = new HashMap<>();
		scores.put("国語", "90点");
		scores.put("数学", "80点");
		scores.put("英語", "65点");

		for(Map.Entry<String,String> entry: scores.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

		//6. このデータは科目と点数というペアで各々のデータが存在しているが、
		//配列やリストと違って順番やインデックスを意識することがそこまで必要ないと感じたため。

	}


}


/*//2次元配列を宣言・作成
String [][] employees = new String [3][];

//それぞれの要素に格納する配列を作成
employees[0] = new String[4];
//番号１
employees[0][0] = "1";
employees[0][1] = "田中太郎";
employees[0][2] = "男性";
employees[0][3] = "27";

employees[1] = new String[4];
//番号２
employees[1][0] = "2";
employees[1][1] = "佐藤花子";
employees[1][2] = "女性";
employees[1][3] = "22";

employees[2] = new String[4];
//番号３
employees[2][0] = "3";
employees[2][1] = "鈴木次郎";
employees[2][2] = "男性";
employees[2][3] = "31";*/