package picpayChallenges;

import java.util.Scanner;

/*______________________________________________________________________________
 * This program finds the longest common prefix among a list of words. It
 * prompts the user to input words separated by commas and returns the common
 * prefix. If no common prefix exists, it informs the user accordingly.
 *_____________________________________________________________________________
 * このプログラムは、単語のリストの中で最も長い共通の接頭辞を見つけます。
 * ユーザーにカンマで区切った単語を入力してもらい、共通の接頭辞を返します。
 * 共通の接頭辞が存在しない場合は、その旨をユーザーに知らせます。
 *
 * Created by: Edogawa Coder
 */

public class PrefixCommonWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String tryAgain;

		do {

			System.out.print("Type the words separated by comma: ");

			String input = scanner.nextLine();

			String[] words = input.split("\\s*,\\s*");

			String result = prefixCommonWords(words);

			if (result.isEmpty()) {
				System.out.println("There is no common prefix among the words.");
			} else {
				System.out.println("The common prefix is: " + result);

			}

			System.out.print("Would you like to try again? (yes/no): ");

			tryAgain = scanner.nextLine().trim().toLowerCase();

		} while (tryAgain.equals("yes"));
	
			if (tryAgain.equals("no")) {
				System.out.println("Thank you! Exiting the program.");
			}

		scanner.close();
	}

	public static String prefixCommonWords(String[] words) {

		if (words == null || words.length == 0) {
			return "";
		}

		String prefix = words[0];

		for (int i = 1; i < words.length; i++) {
			String currentWord = words[i];

			while (!currentWord.startsWith(prefix)) {

				prefix = prefix.substring(0, prefix.length() - 1);
				
				}

			}

		return prefix;
		}
	}

