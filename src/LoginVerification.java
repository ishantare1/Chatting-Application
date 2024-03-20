
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class LoginVerification extends UnicastRemoteObject implements LoginInterface {
    public LoginVerification()throws Exception{}
    @Override
    public boolean checkLogin(String userId,String password)throws RemoteException
    {
        if(userId.equals("Ishan") && password.equals("Tare"))
            return true;
        else
            return false;
    }
}
