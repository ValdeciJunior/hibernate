package com.junior;

import java.util.List;

public class ClienteApp {
	

	public static void main(String[] args) {
		ClienteDAO dao = new ClienteDAO();
		System.out.println(dao.find(1));
//		dao.delete(dao.find(2));
		List<Cliente> clientes = dao.findAll();
		System.out.println(clientes.size());
		
	}

}
