package _11_proxyPattern.javarmi.service;

import _11_proxyPattern.javarmi.entity.Student;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface StudentService extends Remote {
    List<Student> getList() throws RemoteException;
}
