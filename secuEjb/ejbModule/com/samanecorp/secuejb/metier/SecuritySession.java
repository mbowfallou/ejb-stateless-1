package com.samanecorp.secuejb.metier;

import com.samanecorp.secuejb.metier.ISecuritySession;

import jakarta.ejb.Stateless;

@Stateless
public class SecuritySession implements ISecuritySession{

	/**
	 * Cette méthode prend comme paramètre: username et password qui sont de type String
	 * puis effectue la vérification de ces paramètres d'entrée.
	 * Elle retourne true si :
	 * 		- aucun des paramètres n'est vide;
	 * 		- username = "bootcamp" et;
	 * 		- password = "passer123@"
	 */
	@Override
	public boolean log(String username, String password) {
		return (!username.isBlank() && !password.isBlank() && verifyLogin(username, password));
	}

	private boolean verifyLogin(String username, String password) {
		return (username.equals("bootcamp") && password.equals("passer123@"));
	}
}
