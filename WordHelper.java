/*
 * Mackenzie Hughes
 */
public class WordHelper {
	public static String[] sortByVowels(String[] words) {

		int n = words.length;
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = words[i];
		}
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (countVowels(result[j]) > countVowels(result[j + 1])) {

					String t = result[j];

					result[j] = result[j + 1];

					result[j + 1] = t;
				}
			}
		}
		return result;
	}
	public static String[] sortByConsonants(String[] words) {

		int n = words.length;

		String[] result = new String[n];

		for (int i = 0; i < n; i++) {

			result[i] = words[i];
		}
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (countConsonants(result[j]) > countConsonants(result[j + 1])) {

					String t = result[j];

					result[j] = result[j + 1];

					result[j + 1] = t;
				}
			}
		}
		return result;
	}
	public static String[] sortByLength(String[] words) {

		int n = words.length;

		String[] result = new String[n];

		for (int i = 0; i < n; i++) {

			result[i] = words[i];
		}
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (result[j].length() > result[j + 1].length()) {

					String t = result[j];

					result[j] = result[j + 1];

					result[j + 1] = t;
				}
			}
		}
		return result;
	}
	public static int countVowels(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'

					|| c == 'U') {

				count++;
			}
		}
		return count;
	}
	public static int countConsonants(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'

					|| c == 'U') {

			} else {
				count++;
			}
		}
		return count;
	}
}
