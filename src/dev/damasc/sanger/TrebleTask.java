package dev.damasc.sanger;

import java.util.List;

import javax.sound.sampled.LineUnavailableException;

public class TrebleTask implements Runnable, Player {

	private List<Double> notes;

	public TrebleTask(List<Double> notes) {
		this.notes = notes;
	}

	@Override
	public void run() {
		try {
			Beep(notes.get(Note.C5.getIdx()), "quarter");
			Beep(notes.get(Note.C5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.A5.getIdx()), "quarter");
			Beep(notes.get(Note.A5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), 375);
			Beep(notes.get(Note.E5.getIdx()), 125);
			Beep(notes.get(Note.C5.getIdx()), "whole");
			Beep(notes.get(Note.C5.getIdx()), "quarter");
			Beep(notes.get(Note.C5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.A5.getIdx()), "quarter");
			Beep(notes.get(Note.A5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), 375);
			Beep(notes.get(Note.E5.getIdx()), 125);
			Beep(notes.get(Note.C5.getIdx()), "whole");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), 375);
			Beep(notes.get(Note.F5.getIdx()), 125);
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.C5.getIdx()), "quarter");
			Beep(notes.get(Note.C5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.A5.getIdx()), "quarter");
			Beep(notes.get(Note.A5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), 375);
			Beep(notes.get(Note.E5.getIdx()), 125);
			Beep(notes.get(Note.C5.getIdx()), "whole");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), 375);
			Beep(notes.get(Note.F5.getIdx()), 125);
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.C5.getIdx()), "quarter");
			Beep(notes.get(Note.C5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.A5.getIdx()), "quarter");
			Beep(notes.get(Note.A5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.G5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.F5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.E5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), "quarter");
			Beep(notes.get(Note.D5.getIdx()), 375);
			Beep(notes.get(Note.E5.getIdx()), 125);
			Beep(notes.get(Note.C5.getIdx()), "whole");

		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
