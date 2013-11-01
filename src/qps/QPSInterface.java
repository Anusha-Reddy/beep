package qps;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QPSInterface extends Remote {
	
	/**
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public String getActor(String search) throws RemoteException;
	
	/**
	 * 
	 * @param search
	 * @return
	 * @throws RemoteException
	 */
	public String getMovie(String search) throws RemoteException;
	
	/**
	 * 
	 * @param search
	 * @return
	 * @throws RemoteException
	 */
	public String getArtist(String search) throws RemoteException;
	
	/**
	 * 
	 * @param search
	 * @return
	 * @throws RemoteException
	 */
	public String getTeam(String search) throws RemoteException;
	
	public String getActorsByCity(String city) throws RemoteException;
	
	public String getMoviesByCity(String city) throws RemoteException;
	
	public String getArtistsByCity(String city) throws RemoteException;
	
	public String getTeamsByCity(String city) throws RemoteException;
}
