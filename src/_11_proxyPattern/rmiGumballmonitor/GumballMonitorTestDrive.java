package _11_proxyPattern.rmiGumballmonitor;

import _11_proxyPattern.rmiGumballmonitor.service.GumballMachineRemote;

import java.rmi.*;
 
public class GumballMonitorTestDrive {
 
	public static void main(String[] args) {
		String[] location = {"rmi://127.0.0.1:5007/gumballmachine",
		                     "rmi://127.0.0.1:5008/gumballmachine",
		                     "rmi://127.0.0.1:5009/gumballmachine"};

		GumballMonitor[] monitor = new GumballMonitor[location.length];

		for (int i=0;i < location.length; i++) {
			try {
           		GumballMachineRemote machine =
						(GumballMachineRemote) Naming.lookup(location[i]);
           		monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
        	} catch (Exception e) {
            	e.printStackTrace();
        	}
		}
 
		for(int i=0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
