package _11_proxyPattern.dynamicproxy.proxy;

import _11_proxyPattern.dynamicproxy.service.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

	private PersonBean person;

	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try{
			if(method.getName().startsWith("get")){
				return method.invoke(person, args);
			}else if(method.getName().equals("setHotOrNotRating")){
				return method.invoke(person, args);
			}else if(method.getName().startsWith("set")){
				throw new Exception();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
