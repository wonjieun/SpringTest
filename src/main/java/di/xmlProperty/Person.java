package di.xmlProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Person {
	public static void main(String[] args) {
		
		// ApplicationContext를 등록해주는 class
		ApplicationContext context = null;
		
		// di.xml의 bean태그의 내용을 불러와서 context로 등록
		// bean클래스를 spring에 등록하는 과정
		context = new FileSystemXmlApplicationContext(
				"/src/main/java/di/xmlProperty/di.xml");
		
		Car car = (Car) context.getBean("gCar");
		Car car2 = (Car) context.getBean("sCar");
		
		System.out.println("=========");
		System.out.println("car: " + car);
		System.out.println("car2: " + car2);
		System.out.println("=========");
		System.out.println("car info: " + car.getInfo());
		System.out.println("car2 info: " + car2.getInfo());
		System.out.println("=========");
	}
}
