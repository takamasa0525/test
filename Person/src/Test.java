
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

    Person jiro=new Person();
    jiro.name="木村次郎";
    jiro.age=18;
    jiro.address="東京";
    jiro.phoneNumber="080-9999-8888";

    System.out.println(jiro.name);
    System.out.println(jiro.age);
    System.out.println(jiro.address);
    System.out.println(jiro.phoneNumber);
    jiro.talk();
    jiro.run();
    jiro.walk();


    Person hanako=new Person();
    hanako.name="鈴木花子";
    hanako.age=16;
    hanako.address="USA";
    hanako.phoneNumber="090-3333-3333";
    
    hanako.talk();
    hanako.run();
    hanako.walk();


    System.out.println(hanako.name);
    System.out.println(hanako.age);
    System.out.println(hanako.address);
    System.out.println(hanako.phoneNumber);
    
    
    
    Person robot=new Person();
    robot.name="aibo";
    
    
    
	}

}
