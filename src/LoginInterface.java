
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoginInterface extends Remote {
    public boolean checkLogin(String id,String password)throws RemoteException;
}
