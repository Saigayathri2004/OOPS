//write a program to copy one file to another
import java.io.*;
class file1{
public static void main(String args[]){
try{
FileInputStream f=new FileInputStream("sample.txt");//save the file sepratrly and write some content into it.
FileOutputStream f2=new FileOutputStream("cp.txt");
int c;
while((c=f.read())!= -1)
{
f2.write(c);
System.out.print((char)c);
}
f.close();
f2.close();
System.out.println("file copied successfully");
}
catch(IOException e)
{
System.out.println("error");
}
}
}
