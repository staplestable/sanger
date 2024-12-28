package dev.damasc.sanger;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static List<Double> notes = new ArrayList<Double>();
	
	private static void init(List<Double> notes) {
		double baseFrequency = 110;
	    double factor = Math.pow(2, 1.0/12.0);
	    
	    notes.add(baseFrequency);
	    
	    for (int i = 1; i <= 48; i++){
	    	notes.add(notes.get(i-1) * factor);
	    }
	}

	public static void main(String[] args) {

	    System.out.println("Playing music...\n");
	    
	    init(notes);
	    
	    BassTask bass = new BassTask(notes);
		Thread threadBass = new Thread(bass, "Bass");
		
		TrebleTask treble = new TrebleTask(notes);
		Thread threadTreble = new Thread(treble, "Treble");
		
		threadBass.start();
		threadTreble.start();
	    
	}
}
