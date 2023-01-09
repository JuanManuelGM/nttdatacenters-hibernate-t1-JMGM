package com.nttdata.persistence.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * ENTIDAD CLIENT
 * 
 * @author jgilmedi
 */
@Entity
@Table(name = "t_Client")
public class Client extends AbstractEntity implements Serializable {

	/**
	 * SERIAL VERSION
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Id de cliente
	 */
	private Long clientId;
	
	/**
	 * Nombre de cliente
	 */
	private String clientName;
	
	/**
	 * Primer apellido de cliente
	 */
	private String clientFSurname;
	
	/**
	 * Segundo apellido de cliente
	 */
	private String clientSSurname;
	
	/**
	 * DNI de cliente
	 */
	private String clientDNI;

	
	/**
	 * Getter de clientID
	 * 
	 * @return ID de cleinte
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Client_id")
	public Long getClientId() {
		return clientId;
	}

	/**
	 * Getter del nombre de cliente
	 * 
	 * @return Nombre de cliente
	 */
	@Column(name = "Client_Name")
	public String getClientName() {
		return clientName;
	}

	/**
	 * Setter del nombre de cliente
	 * 
	 * @param clientName
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * Getter del primer apellido de cliente
	 * 
	 * @return clientFSurname
	 */
	@Column(name = "Client_First_Surname")
	public String getClientFSurname() {
		return clientFSurname;
	}

	/**
	 * Setter del primer apellido de cliente
	 * 
	 * @param clientFSurname
	 */
	public void setClientFSurname(String clientFSurname) {
		this.clientFSurname = clientFSurname;
	}

	/**
	 * Getter del segundo apellido de cliente
	 * 
	 * @return slientSSurname
	 */
	@Column(name = "Client_Second_Surname")
	public String getClientSSurname() {
		return clientSSurname;
	}

	/**
	 * Setter del segundo apellido de cliente
	 * 
	 * @param clientSSurname
	 */
	public void setClientSSurname(String clientSSurname) {
		this.clientSSurname = clientSSurname;
	}

	/**
	 * Getter del DNI de cliente
	 * 
	 * @return clientDNI
	 */
	@Column(name = "Client_DNI", unique = true, nullable = false,  length = 9)
	public String getClientDNI() {
		return clientDNI;
	}

	/**
	 * Setter del DNI de cliente
	 * 
	 * @param clientDNI
	 */
	public void setClientDNI(String clientDNI) {
		this.clientDNI = clientDNI;
	}

	/**
	 * ToString de cliente
	 */
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", clientFSurname=" + clientFSurname
				+ ", clientSSurname=" + clientSSurname + ", clientDNI=" + clientDNI + "]";
	}

	/**
	 * Override de getId para AbstractEntity
	 */
	@Override
	public Long getId() {
		return this.clientId;
	}

	/**
	 * Override de setID para abstractEntity
	 */
	@Override
	public void setId(Long id) {
		this.clientId = id;
	}
	
}
