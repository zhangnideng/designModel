package _11_proxyPattern.rmiGumballmonitor;


import _11_proxyPattern.rmiGumballmonitor.service.impl.GumballMachine;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {

	public static void main(String[] args) {

		try {
			GumballMachine gumballMachine1 = new GumballMachine("HeiLongJiang", 100);
            GumballMachine gumballMachine2 = new GumballMachine("JiLin", 100);
            GumballMachine gumballMachine3 = new GumballMachine("LiaoNing", 100);
            LocateRegistry.createRegistry(5007);
            LocateRegistry.createRegistry(5008);
            LocateRegistry.createRegistry(5009);
            Naming.rebind("rmi://127.0.0.1:5007/gumballmachine", gumballMachine1);
            Naming.rebind("rmi://127.0.0.1:5008/gumballmachine", gumballMachine2);
            Naming.rebind("rmi://127.0.0.1:5009/gumballmachine", gumballMachine3);
            System.out.println("服务已启动");
        } catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
