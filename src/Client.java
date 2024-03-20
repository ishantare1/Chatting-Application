
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class Client {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter server name");
        String serverName = sc.next();
        System.out.println("Enter port no.");
        int portNo = sc.nextInt();
        System.out.println("Enter Unique Id");
        String uniqueId = sc.next();
        System.out.println("Enter user Id");
        String userId = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        
        Registry reg = LocateRegistry.getRegistry(serverName,portNo);//Server.java
        LoginInterface li = (LoginInterface)reg.lookup(uniqueId);//Server.java
        boolean bool = li.checkLogin(userId, password);//LoginVerification.java
        if(bool){
            System.out.println("Hello World");
        }
        else{
            System.exit(0);
        }
    }
}
