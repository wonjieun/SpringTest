package di.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import di.tire.Tire;

public class Car {
	// annotation으로 di를 하겠다는 의미
	@Autowired
//	@Resource
//	@Inject
	@Qualifier("gTire") private Tire tire;
	
	public String getInfo() {
		return tire.getProduct() + " 장착";
	}

}
