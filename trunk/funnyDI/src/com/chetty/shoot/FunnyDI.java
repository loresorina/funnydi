package com.chetty.shoot;

import com.chetty.module.IModule;

public class FunnyDI {
	public static Shooter getShooter(IModule module) {
		return new Shooter(module);		
	}
}