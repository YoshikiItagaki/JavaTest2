package jp.co.aforce.test;

public class Employee{

	//3. 社員クラス作成
		private int IdNumber;
		private String name;
		private String gender;
		private int age;

		public Employee(int IdNumber, String name, String gender, int age){
			this.IdNumber = IdNumber;
			this.name = name;
			this.gender = gender;
			this.age = age;
		}

		public int getIdNumber() {
			return IdNumber;
		}

		public String getName() {
			return name;
		}

		public String getGender() {
			return gender;
		}

		public int getAge() {
			return age;
		}


}
