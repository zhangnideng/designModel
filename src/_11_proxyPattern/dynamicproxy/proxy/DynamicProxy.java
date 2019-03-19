package _11_proxyPattern.dynamicproxy.proxy;

import _11_proxyPattern.dynamicproxy.service.PersonBean;
import _11_proxyPattern.dynamicproxy.service.impl.PersonBeanImpl;

import java.lang.reflect.Proxy;

public class DynamicProxy {
	
	private PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean)Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
	
	private PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean)Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

	public static void main(String[] args) {
		DynamicProxy dynamicProxy = new DynamicProxy();
		dynamicProxy.test();
	}
	
	public void test(){
		PersonBean zhx = new PersonBeanImpl("zhx", "male", "football", 50, 1);
		
		PersonBean ownerProxy = getOwnerProxy(zhx);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try{
			ownerProxy.setHotOrNotRating(10);
		}catch(Exception e){
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(zhx);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try{
			nonOwnerProxy.setInterests("bowling, Go");
		}catch(Exception e){
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(10);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}

}
