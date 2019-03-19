package _11_proxyPattern.javarmi.service.impl;

import _11_proxyPattern.javarmi.entity.Student;
import _11_proxyPattern.javarmi.service.StudentService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {

    public StudentServiceImpl() throws RemoteException {
    }

    @Override
    public List<Student> getList() throws RemoteException {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(15);
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(20);
        list.add(s1);
        list.add(s2);

        return list;
    }
}
