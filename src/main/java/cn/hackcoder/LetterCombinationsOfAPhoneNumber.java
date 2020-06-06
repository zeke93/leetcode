package cn.hackcoder;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. Letter Combinations of a Phone Number
 */
public class LetterCombinationsOfAPhoneNumber {
	private Map<Character, List<Character>> mapping = new HashMap() {
		{
			mapping.putIfAbsent('2', new ArrayList<Character>() {{
				add('a');
				add('b');
				add('c');
			}});
			mapping.putIfAbsent('3', new ArrayList<Character>() {{
				add('d');
				add('e');
				add('f');
			}});
			mapping.putIfAbsent('4', new ArrayList<Character>() {{
				add('g');
				add('h');
				add('i');
			}});
			mapping.putIfAbsent('5', new ArrayList<Character>() {{
				add('j');
				add('k');
				add('l');
			}});
			mapping.putIfAbsent('6', new ArrayList<Character>() {{
				add('m');
				add('n');
				add('o');
			}});
			mapping.putIfAbsent('7', new ArrayList<Character>() {{
				add('p');
				add('q');
				add('r');
				add('s');
			}});
			mapping.putIfAbsent('8', new ArrayList<Character>() {{
				add('t');
				add('u');
				add('v');
			}});
			mapping.putIfAbsent('8', new ArrayList<Character>() {{
				add('w');
				add('x');
				add('y');
				add('z');
			}});
		}
	};

	private List<String> results = new ArrayList<>();

	private class Route {
		private int index;
		private int step;
		private int maxStep;

		public Route() {
		}

		public Route(int index, int step, int maxStep) {
			this.index = index;
			this.step = step;
			this.maxStep = maxStep;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public int getStep() {
			return step;
		}

		public void setStep(int step) {
			this.step = step;
		}

		public int getMaxStep() {
			return maxStep;
		}

		public void setMaxStep(int maxStep) {
			this.maxStep = maxStep;
		}
	}


	/*private void combine(List<Character> characters, List<List<Character>> lists, int index, int innerIndex, int n) {
		if (index == n) {
			StringBuilder sb = new StringBuilder();
			for (char c : characters) {
				sb.append(c);
			}
			results.add(sb.toString());
			combine(characters, lists, ++index, inden);
		}

		characters.add(lists.get(index).get(innerIndex));
		combine();
	}

	public List<String> letterCombinations(String digits) {
		List<List<Character>> lists = new ArrayList<>();
		for (char c : digits.toCharArray()) {
			lists.add(mapping.get(c));
		}
	}*/
}
