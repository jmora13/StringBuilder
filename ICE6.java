
public class ICE6 {	
	public static void main(String[] args) {
		String s = "He sprung from the cabin-window, as he said this, upon the ice-raft which lay close to the vessel. He was soon borne away by the waves and lost in darkness and distance.";
		String[] tokens = s.split("[ ,.-]");

		for (int i = 0; i < tokens.length; i++)
			tokens[i] = tokens[i].toLowerCase();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].length() == 0) // ignore empty string
				continue;
			int count = 0;
			for (String ss : tokens)
				if (tokens[i].equals(ss))
					count++;
			if (!sb.toString().contains(tokens[i] + " "))
				sb.append(tokens[i] + " " + count + ";");
		}

		System.out.println(sb);
	}
}
