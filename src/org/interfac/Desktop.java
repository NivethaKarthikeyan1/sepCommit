package org.interfac;

public class Desktop implements Hardware,Software {
private void desktopModel() {
System.out.println("Desktop model is EVS-301");
}

@Override
public void softwareResources() {
System.out.println("application Server");	
}

@Override
public void hardwareResources() {
System.out.println("CPU");	
}
public static void main(String args[]) {
	Desktop d = new Desktop();
	d.desktopModel();
	d.softwareResources();
	d.hardwareResources();
}
}
