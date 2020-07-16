package project1;

public class Char_count {
	public static void main(String[] args) {
		Char_count cc = new Char_count();
		cc.countChars("My name is Prathamesh");
	}

	public void countChars(String str) {
		char[] strArr;
		do {
			strArr = str.toCharArray();
			char ch = strArr[0];
			int count = 1;
			for (int i = 1; i < strArr.length; i++) {
				if (ch == strArr[i]) {
					count++;
				}
			}
			// We don't need to count spaces
			if (((ch != ' ') && (ch != '\t'))) {
				System.out.println(ch + " - " + count);
			}
			// replace all occurrence of the character
			// which is already iterated and counted
			str = str.replace("" + ch, "");
		} while (strArr.length > 1);
	}

}
