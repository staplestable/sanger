package dev.damasc.sanger;
import java.util.List;

import javax.sound.sampled.LineUnavailableException;

public class BassTask implements Runnable, Player {
	
	private List<Double> notes;
	
	public BassTask(List<Double> notes) {
		this.notes = notes;
	}
	
	@Override
	public void run() {
		try {
			Beep(notes.get(Note.C3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.F4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.D4.getIdx()), "quarter");
			Beep(notes.get(Note.B3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.A3.getIdx()), "quarter");
			Beep(notes.get(Note.F3.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.C3.getIdx()), "whole");
			Beep(notes.get(Note.C3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.F4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.D4.getIdx()), "quarter");
			Beep(notes.get(Note.B3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.A3.getIdx()), "quarter");
			Beep(notes.get(Note.F3.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.C3.getIdx()), "whole");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.D4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.B3.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.D4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), 375);
			Beep(notes.get(Note.D4.getIdx()), 125);
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.B3.getIdx()), "quarter");
			Beep(notes.get(Note.C3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.F4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.D4.getIdx()), "quarter");
			Beep(notes.get(Note.B3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.A3.getIdx()), "quarter");
			Beep(notes.get(Note.F3.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.C3.getIdx()), "whole");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.D4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.B3.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.D4.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), 375);
			Beep(notes.get(Note.D4.getIdx()), 125);
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.B3.getIdx()), "quarter");
			Beep(notes.get(Note.C3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.F4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.E4.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.D4.getIdx()), "quarter");
			Beep(notes.get(Note.B3.getIdx()), "quarter");
			Beep(notes.get(Note.C4.getIdx()), "quarter");
			Beep(notes.get(Note.A3.getIdx()), "quarter");
			Beep(notes.get(Note.F3.getIdx()), "quarter");
			Beep(notes.get(Note.G3.getIdx()), "quarter");
			Beep(notes.get(Note.C3.getIdx()), "whole");
			
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
