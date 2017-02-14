package org.asmod.greetingsthread;

public class GreetingsTask implements Runnable {
    private Greetings greetings;
    private String name;
    

    public GreetingsTask(Greetings greetings, String name) {
	super();
	this.greetings = greetings;
	this.name = name;
    }



    @Override
    public void run() {
	System.out.println("Running...");
	System.out.println(this.greetings.sayMessage("Hello", name));
    }

}
