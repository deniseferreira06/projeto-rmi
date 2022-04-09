import java.rmi.*;
 
public interface Hello extends Remote {
   public String hello() throws RemoteException;
   public float multiplicacao(float a, float b) throws RemoteException;
}


