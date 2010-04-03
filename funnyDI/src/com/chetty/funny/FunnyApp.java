package com.chetty.funny;

import com.chetty.client.Client;
import com.chetty.module.Module;
import com.chetty.shoot.FunnyDI;
import com.chetty.shoot.Shooter;

public class FunnyApp {
	public static void main(String[] args) throws Exception {
		Shooter shooter = FunnyDI.getShooter(new Module());
		
		Client client = (Client) shooter.fireShot(Client.class);
		
		client.doSomething();
	}
}
