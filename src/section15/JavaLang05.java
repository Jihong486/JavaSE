package section15;

import java.util.Arrays;

/*
 * String 메서드
 */
public class JavaLang05 {
	public static void main(String[] args) {
		
		//문자열 길이 length()
		String str1 = "ABCDEFGHIJK";
		System.out.println("length : " + str1.length());
		
		//문자열이 지정한 문자로 시작하는지 판단 starWith()
		String str2 = "apple";
		boolean startsWith = str2.startsWith("a"); //startWith() - 무엇으로 시작하는지.
		System.out.println("startsWith : " + startsWith);
		
		//문자열 마지막에 지정한 문자가 있는지 판단 endsWith()
		String str3 = "text";
		boolean endsWith = str3.endsWith("t"); //endsWith() - 무엇으로 끝나는지.
		System.out.println("endsWith : " + endsWith);
		
		//문자 인덱스번호로 반환 indexOf()
		String str4 = "abcdef";
		int indexOf = str4.indexOf("d");
		System.out.println("indexOf : " + indexOf);
		
		//문자열에 지정한 문자가 마지막 몇번째 있는지 int로 반환 lastIndexOf()
		String str5 = "AdroidApp";
		int lastIndexOf = str5.lastIndexOf("A");
		System.out.println("lastIndexOf : " + lastIndexOf);
		
		//문자열 치환 replace(a,b) , replaceAll(a,b)
		String str6 = "A*B*C*D";
		String replace = str6.replace("*","-"); // replace(a,b) - a를 b로 바꿔줌. 
		System.out.println("replace : " + replace);
		
		String str7 = "Hello, 123 World! 456 Java 789";
		String replaceAll = str7.replaceAll("\\d",""); // replaceAll(a,b) a전부 b로 바꿔줌. ※'\\d' 는 정규식. 숫자를 의미.
		System.out.println("replaceAll : " + replaceAll);
		
		//문자열 나누기 배열로 반환 split()
		String str8 = "A:B:C:D:E:F:G:abcdefg";
		String[] splitArr = str8.split(":");
		for(String split : splitArr) {
			System.out.println(split);
		}
		
		System.out.println(Arrays.toString(splitArr)); //위 for문을 안써도 표현가능.
		
		//문자열 절삭 substring(,)
		String str9 = "abcDEF";
		String substring = str9.substring(0,2);
		System.out.println("substring : " + substring);
		
		//소문자 변환 toLowerCase()
		String str10 = "abcDEF";
		String toLowerCase = str10.toLowerCase();
		System.out.println("toLowerCase : " + toLowerCase);
		
		//대문자 변환 toUpperCase()
		String str11 = "abcDEF";
		String toUpperCase = str11.toUpperCase();
		System.out.println("toUpperCase : " + toUpperCase);
		
		//공백제거 trim()
		String str12 = "      java java java      ";
		String trim = str12.trim(); //문자열 앞과 뒤의 공백을 제거.
		System.out.println("trim : " + trim);
		
		//공백제거2
		String str13 = "      java java java      ";
		String replace2 = str13.replace(" ",""); //replace()를 활용하여 " "을 ""로.
		System.out.println("replace2 : " + replace2);
		
		//문자비교 compareTo()
		String str14 = "A";
		String str15 = "B";
		int compareTo = str14.compareTo(str15); //메서드호출한 str14 기준으로 입력값15 보다 작으면 -값, 같으면 0, 크면 +값.
		System.out.println("compareTo : " + compareTo);
		
		//문자 포함여부
		String str16 = "abcd";
		String str17 = "cd";
		boolean contains = str16.contains(str17); //메서드호출한 str16 기준으로 str17값을 포함하는지 여부.
		System.out.println("contains : " + contains);
		
	}
}





