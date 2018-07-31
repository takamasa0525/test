
public class Robot {
	public static void main(String[]args){

		Person robot=new Person();
		robot.name="aibo";
        System.out.println(robot.name);


        robot.talk();
        robot.run();
        robot.walk();

        Person asimo=new Person();
        asimo.name="asimo";
        System.out.println(asimo.name);

        asimo.talk();
        asimo.run();
        asimo.walk();

        Person pepper=new Person();
        pepper.name="pepper";
        System.out.println(pepper.name);

        pepper.talk();
        pepper.run();
        pepper.walk();

        Person doraemon=new Person();
        doraemon.name="doraemon";

        System.out.println(doraemon.name);

        doraemon.talk();
        doraemon.run();
        doraemon.walk();

	}

}
