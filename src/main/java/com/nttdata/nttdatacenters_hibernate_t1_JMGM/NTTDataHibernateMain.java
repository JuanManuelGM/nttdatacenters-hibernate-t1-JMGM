package com.nttdata.nttdatacenters_hibernate_t1_JMGM;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.nttdata.persistence.entities.Client;
import com.nttdata.services.impl.ClientManagerServiceImpl;
import com.nttdata.services.interfaces.ClientManagerServiceI;

/**
 * Taller 1 de Hibernate
 * 
 * Main Class
 * 
 * @author jgilmedi
 *
 */
public class NTTDataHibernateMain {

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Apertura de sesion
		Session session = NTTDataHibernateUtil.getSessionFactory().openSession();
		
		//Inyeccion de servicios
		ClientManagerServiceI clientService = new ClientManagerServiceImpl(session);
		
		//Auditoria
		String updatedUser = "Juanma";
		Date updateDate = new Date();
		
		//Creacion de clientes
		Client client1 = new Client();
		client1.setClientDNI("123456789A");
		client1.setClientName("Paco");
		client1.setClientFSurname("Medina");
		client1.setClientSSurname("Morales");
		
		Client client2 = new Client();
		client2.setClientDNI("123456789B");
		client2.setClientName("Pepe");
		client2.setClientFSurname("Francisco");
		client2.setClientSSurname("Peral");
		
		//Uso de servicio de cliente
		clientService.insertNewClient(client1);
		clientService.insertNewClient(client2);
		List<Client> allClients = clientService.searchAllClients();
		List<Client> nameCLients = clientService.searchClientByNameAndSurname("Paco", "Medina", "Morales");
		
		//Update de cliente
		client1.setClientName("Luis");
		clientService.updateClient(client1);
		
		//Delete de cliente
		clientService.deleteClient(client2);


	}
}
