package dev.damasc.sanger;

public enum Note {
	A2(0), As2(1), B2(2), C3(3), Cs3(4), D3(5), Ds3(6), E3(7), F3(8), Fs3(9), G3(10), Gs3(11), A3(12), As3(13), B3(14),
	C4(15), Cs4(16), D4(17), Ds4(18), E4(19), F4(20), Fs4(21), G4(22), Gs4(23), A4(24), As4(25), B4(26), C5(27),
	Cs5(28), D5(29), Ds5(30), E5(31), F5(32), Fs5(33), G5(34), Gs5(35), A5(36), As5(37), B5(38), C6(39), Cs6(40),
	D6(41), Ds6(42), E6(43), F6(44), Fs6(45), G6(46), Gs6(47), A6(48);

	private final int idx;

	Note(int idx) {
		this.idx = idx;
	}

	public int getIdx() {
		return idx;
	}
}
