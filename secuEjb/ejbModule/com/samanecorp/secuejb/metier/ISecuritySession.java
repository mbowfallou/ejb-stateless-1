package com.samanecorp.secuejb.metier;

import jakarta.ejb.Local;

@Local
public interface ISecuritySession {
	public boolean log(String username, String password);
}
