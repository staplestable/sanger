package dev.damasc.sanger;

import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public interface Player {

	default void Beep(double frequency, Object duration) throws LineUnavailableException, InterruptedException {

		Map<String, Integer> lengthMap = new HashMap<String, Integer>();
		lengthMap.put("whole", 2000);
		lengthMap.put("half", 1000);
		lengthMap.put("quarter", 500);
		lengthMap.put("eighth", 250);
		lengthMap.put("sixteenth", 125);

		int tempDuration = 0;
		byte[] buf = new byte[1];
		AudioFormat af = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 8, 1, 1, 44100, false);
		DataLine.Info info = new DataLine.Info(SourceDataLine.class, af);

		SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
		line.open(af, 44100);
		line.start();

		if (duration instanceof String) {
			tempDuration = lengthMap.get(duration);
			duration = tempDuration;
		}

		int numSamples = (int) (44100 * ((Integer) duration / 1000.0));

		for (int i = 0; i < numSamples; i++) {
			double angle = i / (44100.0 / frequency) * 2.0 * Math.PI;
			buf[0] = (byte) (Math.sin(angle) * 127.0 * 0.05);
			line.write(buf, 0, 1);
		}

		line.drain();
		line.close();
	}
}
