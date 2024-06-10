import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client{
public static void main(String arg[]) throws Exception{

//InetAddress ia = InetAddress.getLocalHost();
Socket cSock = new Socket("localhost",1234);
DataInputStream in = new DataInputStream(cSock.getInputStream());
DataOutputStream out = new DataOutputStream(cSock.getOutputStream());
System.out.println("Please Enter String");
Scanner sc = new Scanner(System.in);
String inp = sc.nextLine();
out.writeUTF(inp);
System.out.println("Response from server");
System.out.println(in.readUTF().toString());
cSock.close();
}
}