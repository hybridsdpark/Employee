package webapp.escape;

/*
 * Background Colours 
 * 40 Black 
 * 41 Red 
 * 42 Green 
 * 43 Yellow 
 * 44 Blue 
 * 45 Magenta
 * 46 Cyan 
 * 47 White
 */

public enum Background {

	BLACK(40), 
	RED(41), 
	GREEN(42), 
	YELLOW(43), 
	BLUE(44), 
	MAGENTA(45), 
	CYAN(46), 
	WHITE(47);

	final int Value;

	private Background(int value) {
		this.Value = value;
	}

}
