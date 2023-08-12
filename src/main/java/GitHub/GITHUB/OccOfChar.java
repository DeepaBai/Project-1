package GitHub.GITHUB;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccOfChar {

	public static void main(String[] args) {

		String str = "Sophia";

		Map<Character, Integer> mp = new LinkedHashMap();

		char[] c = str.toCharArray();

		for (Character ch : c) {
			if (mp.containsKey(ch)) {
				int val = mp.get(ch);
				mp.put(ch, val + 1);
			}

			else {
				mp.put(ch, 1);
			}
		}
		System.out.println(mp);
	}
}
