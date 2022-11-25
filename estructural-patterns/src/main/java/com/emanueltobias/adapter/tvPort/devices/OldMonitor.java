package com.emanueltobias.adapter.tvPort.devices;

import com.emanueltobias.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
