import java.net.*;
import java.io.*;

public class Server{
public static void main(String arg[]) throws Exception{
ServerSocket server = new ServerSocket(1234);
System.out.println("Server is Waiting");
while(true){
Socket con = server.accept();
DataInputStream in = new DataInputStream(con.getInputStream());
DataOutputStream out = new DataOutputStream(con.getOutputStream());
StringBuilder inp = new StringBuilder(in.readUTF().toString());
StringBuilder op=inp.reverse();
System.out.println("Server response");
out.writeUTF(op.toString());
}
}
}