package _11_proxyPattern.javarmi.client;

import _11_proxyPattern.javarmi.entity.Student;
import _11_proxyPattern.javarmi.service.StudentService;

import java.rmi.Naming;
import java.util.List;

public class GetService {
    public static void main(String[] args) {
        try{
            StudentService studentService = (StudentService) Naming.lookup("rmi://127.0.0.1:5008/StudentService");
            List<Student> list = studentService.getList();
            for(Student s : list){
                System.out.println("name: " + s.getName() + ", age: " + s.getAge());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
