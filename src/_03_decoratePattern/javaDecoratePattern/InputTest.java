package _03_decoratePattern.javaDecoratePattern;

import _03_decoratePattern.javaDecoratePattern.decorator.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException{
        String path = "E:/file/test.txt";
        int c;
        try(InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path)));){
            while((c = in.read()) > 0){
                System.out.println((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
