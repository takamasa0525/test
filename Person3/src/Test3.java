
public class Test3 {

	public static void main(String[] args) {
	 Person3 taro = new Person3();
	 taro.name="山田太郎";
	 taro.age=20;
	 System.out.println(taro.name);
	 System.out.println(taro.age);

	 taro.talk();
	 taro.walk();
	 taro.run();


	 Person3 jiro = new Person3("jiro",20);
	 System.out.println(jiro.name);
	 System.out.println(jiro.age);

	 Person3 saburo = new Person3("saburo");
	 System.out.println(saburo.name);
	 System.out.println(saburo.age);


	 Person3 namaenashi = new Person3(25);
	 System.out.println(namaenashi.name);
	 System.out.println(namaenashi.age);


	 Person3 hanako = new Person3(17,"hanako");
	 System.out.println(hanako.name);
	 System.out.println(hanako.age);
	 }

}