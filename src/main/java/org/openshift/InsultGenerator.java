package org.openshift;

import java.util.Random;

public class InsultGenerator {
	private static final String BAWDY1 = "Bawdy1";

	public String generateInsult() {
		String words[][] = { { "Artless1", BAWDY1, "Beslubbering2" }, { "Base-court4", "Bat-fowling4", "Beef-witted4" },
				{ "Apple-john3", "Baggage3", "Barnacle3" } };
		String vowels = "AEIOU";
		String article = "an";
		String firstAdjective = words[0][new Random().nextInt(words[0].length)];
		String secondAdjective = words[1][new Random().nextInt(words[1].length)];
		String noun = words[2][new Random().nextInt(words[2].length)];
		if (vowels.indexOf(firstAdjective.charAt(0)) == -1) {
			article = "a";
		}
		return String.format("Thou art %s %s %s %s!", article, firstAdjective, secondAdjective, noun);
	}

}
