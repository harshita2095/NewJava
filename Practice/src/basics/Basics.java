package basics;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Basics {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		List<String> strList = Arrays.asList("Harshita", "Singh", "aaa", "the");
		List<String> sortedList2 = strList.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);
		System.out.println(">>> "+sortedList2);
		
		
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		Map<Integer,Employee> empMap = new HashMap<>();
	    for(int i = 0; i < employeeList.size(); i ++) {
	    	empMap.put(employeeList.get(i).getId(), employeeList.get(i));
	    }
		
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Havi", "US"));
		personList.add(new Person("Khushi", "Brazil"));
		personList.add(new Person("Mom", "US"));
		personList.add(new Person("Dad", "Germany"));
		
		int[] intArray = new int[] {4,2,3,2,3,10, 10, -4};
		List<Integer> intList = Arrays.asList(4,2,3,2,3,10, 10, -4);
		List<String> values = Arrays.asList("Believe","for","good","Believe", "Believe", "for", "trust", "for", "for");
		String strValues = "Harshita Singhi Singh a the a Harshitay the";
		String[] strArray = new String[] {"Believe","for","good", "trust"};
		
		System.out.println("Anagram : "+isAnagram("Hello", "hello"));
		System.out.println("Reverse String : "+ reverseString("hello"));
		System.out.println("Check Palindrome String : "+checkPalindromeString("ava"));
		System.out.println("Check Palindrome Number : "+checkPalindromeNumber(121));
		System.out.println("getAscendingListOfString : ");getAscendingListOfString(strList);
		System.out.println("getDescendingListOfString : ");getDescendingListOfString(strList);
		System.out.println("getAscendingEmployeeNameList : ");getAscendingEmployeeNameList(employeeList);
		System.out.println("getDescendingEmployeeNameList : ");getDescendingEmployeeNameList(employeeList);
		System.out.println("getAscendingEmployeeAgeList : ");getAscendingEmployeeAgeList(employeeList);
		System.out.println("getDescendingEmployeeAgeList : ");getDescendingEmployeeAgeList(employeeList);
		System.out.println("getAscendingEmployeeSalaryList : ");getAscendingEmployeeSalaryList(employeeList);
		System.out.println("getDescendingEmployeeSalaryList : ");getDescendingEmployeeSalaryList(employeeList);
		System.out.println("getMinFromListOfInteger : "+getMinFromListOfInteger(Arrays.asList(1,4,6,2,5,3)));
		System.out.println("getMaxFromListOfInteger : "+getMaxFromListOfInteger(Arrays.asList(1,4,6,2,5,3)));
		System.out.println("countDuplicateString : "+countDuplicateString(Arrays.asList("Harshita", "Singh", "Singh","a","the","a","the")));
		System.out.println("countDuplicateString2 : "+countDuplicateString2("my name is harshita my name is harshita"));
		System.out.println("characterCount : ");characterCount("ahgsbabhqqgggg");
        System.out.println("getEmployeeNameStartsWithM : ");getEmployeeNameStartsWithM(employeeList);
        System.out.println("printTrueIfSalaryGreaterThan1000 : "+printTrueIfSalaryGreaterThan1000(employeeList));
        System.out.println("gropuingByUSandNonUSPerson : ");gropuingByUSandNonUSPerson(personList);
        System.out.println("groupingByGender : "+groupingByGender(employeeList));
        System.out.println("printDistinctDepartmentNames : ");printDistinctDepartmentNames(employeeList);
        System.out.println("averageAgeMaleFemaleEmployees : "+averageAgeMaleFemaleEmployees(employeeList));
        System.out.println("getHighestPayingEmployee : "+getHighestPayingEmployee(employeeList));
        System.out.println("isBracketBalancedUsingStack : "+isBracketBalancedUsingStack("{[])}"));
        System.out.println("sortStringWithoutUsingSortFunc : "+sortStringWithoutUsingSortFunc("badc"));
        System.out.println("getMinimalSubsetOfMaximumSum : "+getMinimalSubsetOfMaximumSum(Arrays.asList(5,1,6,9)));
        System.out.println("getMinimalSubsetOfMaximumSum2 : "+getMinimalSubsetOfMaximumSum2(Arrays.asList(5,1,6,9)));
        System.out.println("getMinimalSubsetOfMaximumSum3 : "+ getMinimalSubsetOfMaximumSum3(Arrays.asList(5,1,6,9)));
        System.out.println("shiftELements : "+ shiftELements("abcde", 2));
        System.out.println("isCircular : "+ isCircular("efgy"));
        System.out.println("findWinner : "+findWinner("wwbbbwwwwbbbbbbbbbw"));
        System.out.print("printVanEckSequence : "); printVanEckSequence(10);
        System.out.println("findEmployeeWLowestSalary : "+findEmployeeWLowestSalary(employeeList));
        System.out.println("findEmployeeWLowestSalary2 : "+findEmployeeWLowestSalary2(employeeList));
        System.out.println("incrementByTenWhoseAgeIsGreatherThanThirty : "+ incrementByTenWhoseAgeIsGreatherThanThirty(employeeList));
	    System.out.println("sortEmployeesUsingId : "+ sortEmployeesUsingId(employeeList));
	    System.out.print("sortIDinAscendinginMap : "); sortIDinAscendinginMap(empMap);
	    System.out.println("sortIDinAscendinginMap2 : "); sortIDinAscendinginMap2(empMap);
	    System.out.print("sortIntArrayUsingStream : "); sortIntArrayUsingStream(intArray);
	    System.out.print("sortDescIntArrayUsingStream : "); sortDescIntArrayUsingStream(intArray);
	    System.out.print("printAllMissingNumbers : "); printAllMissingNumbers(intArray);
	    System.out.println("getFarthestElement : "+ getFarthestElement(intArray, 9));
	    System.out.println("replaceZeroToOne : "+ replaceZeroToOne(72035));
	    System.out.println("sumOfOddIntegerAndSquaring : "+sumOfOddIntegerAndSquaring(Arrays.asList(2,4,5,3)));
	    System.out.println("findIndexOfALetter : "+ findIndexOfALetter("harshita", 'h'));
	    System.out.println("findMaxArraySizeAmericanExpress : "+ findMaxArraySizeAmericanExpress(7,42, new int[] {6,42,11,7,42,2}));
	    System.out.println("stringReverseUsingStringBuilder : "+stringReverseUsingStringBuilder("harshita"));
	    System.out.println("sortArrayWithoutUsingPreDefinedFunc : "); sortArrayWithoutUsingPreDefinedFunc(new int[] {1, 1, 0, 1,0,0,1});
	    System.out.println("reverseMiddleString : "+reverseMiddleString("Humans are beautiful"));
	    System.out.println("getEmpNameWhoAreMale : "+ getEmpNameWhoAreMale(employeeList));
	    System.out.println("findDistinctValues : "+ findDistinctValues(values));
	    System.out.println("findOccurenceOfEachElement : "+findOccurenceOfEachElement(values));
	    System.out.print("getTopTwoElements : "); getTopTwoElements(values);
	    System.out.println("checkStringEquals : ");checkStringEquals("ABC", new String("ABC"));
	    System.out.println("findSimultaneoulsyBracket : " + findSimultaneoulsyBracket("{ [ () { } } ]"));
	    System.out.println("findLongestEvenString : "+ findLongestEvenString(strValues));
	    System.out.println("findSecondHighestNumber : "+findSecondHighestNumber(intArray));
	    System.out.println("findSecondHighestNumber2 : "+ findSecondHighestNumber2(intArray));
	    System.out.println("mergeTwoLists : "+ mergeTwoLists(Arrays.asList("a","b"), Arrays.asList("c","d")));
	    System.out.println("sortHashMapByKey : "); sortHashMapByKey(empMap);
	    System.out.println("sortHashMapByValue : "); sortHashMapByValue(empMap);
	    System.out.println("findLargestSum : "+findLargestSum(new int[] {1,-3,5,6,-8,7,-9,-5,10,13,-3,6}));
	    System.out.println("reverseNum : "+reverseNum(345));
	    System.out.println("getPersonNameFromCountry : "+getPersonNameFromCountry(personList));
	    System.out.println("checkSameElementsInTwoArrays : "+checkSameElementsInTwoArrays(new Integer[] {2,3,4,1}, new Integer[] {4,5,4,3,2,1,1,2}));
	    System.out.println("shuffleAnArray : "+shuffleAnArray(intArray));
	    System.out.println("printDateInSpecifiedFormat : " +printDateInSpecifiedFormat("MM-DD-YYYY"));
	    System.out.println("removeAllOccurenceOfAinString : "+removeAllOccurenceOfAinString("abcdABCDabcdABCD"));
	    System.out.println("getDistinctCharAndCountUsingHashMap : "); getDistinctCharAndCountUsingHashMap("abskwabsahegegee");
	    proveStringIsImmutable();
	    System.out.println("compareTwoListsOfInteger : "+compareTwoListsOfInteger(Arrays.asList(3,5,6,2,4), Arrays.asList(2,3,5,6)));
	    System.out.println("compareTwoListsOfStrings : "+compareTwoListsOfStrings(Arrays.asList("havi","khushi", "mum"), Arrays.asList("mum","havi","dad","khushi")));
        System.out.println("reverseLinkedList : "+reverseLinkedList(new LinkedList<Integer>( Arrays.asList(3,5,62,37,4))));
        System.out.println("sortingArray : "+ sortingArray(intArray));
        System.out.println("sortingArray2 : "+sortingArray2(intArray));
        System.out.println("leadingTrailingSpace : "+ leadingTrailingSpace(" !   hello "));
        System.out.println("removeWhiteSpaces : "+removeWhiteSpaces(" !   hello  ! "));
        System.out.println("getEvenNumber : "+getEvenNumber(Arrays.asList(4,4,55,67,88,20)));
        System.out.println("containsOnlyOddNumber : "+containsOnlyOddNumber(Arrays.asList(3,67,55,67)));
        System.out.println("printFibonacciSeries : "); printFibonacciSeries(10);
        System.out.println("isPrime : "+isPrime(10));
        System.out.println("isVowelPresent : "+isVowelPresent("hello"));
        System.out.println("swapNumbers : "); swapNumbers(10,8);
        System.out.println("intArrayReverse : "); intArrayReverse(intArray);
        System.out.println("stringArrayReverse : "); stringArrayReverse(strArray);
        System.out.println("reverseUsingChar : "+reverseUsingChar("Reverse"));
        System.out.println("getListOfPersonsByCountry : "+ getListOfPersonsByCountry(personList));
        System.out.println("getListOfPersonsByCountry2 : "+ getListOfPersonsByCountry2(personList));
        System.out.println("getCountOfPeopleFromDistinctCountry : "+ getCountOfPeopleFromDistinctCountry(personList));
        System.out.println("getCountOfPeopleFromDistinctCountry2 : "+ getCountOfPeopleFromDistinctCountry2(personList));
        System.out.println("getNamesOfPersonFromDistinctCountry : "+ getNamesOfPersonFromDistinctCountry(personList));
        System.out.println("getNamesOfPersonFromDistinctCountry2 : "+ getNamesOfPersonFromDistinctCountry2(personList));
        System.out.println("getUSNonUSTrueFalse : "+ getUSNonUSTrueFalse(personList));
        System.out.println("getUSNonUSTrueFalseWithNames : "+ getUSNonUSTrueFalseWithNames(personList));
        System.out.println("getUSNonUSTrueFalseWithListOfPerson : "+ getUSNonUSTrueFalseWithListOfPerson(personList));
        System.out.print("convertIntegerArrayListToIntArray : "); convertIntegerArrayListToIntArray(intList);
        System.out.println("convertIntArrayToIntegerArrayList : "+ convertIntArrayToIntegerArrayList(intArray));
        System.out.println("findSecondHighestNumberFromList : "+ findSecondHighestNumberFromList(intList));
        System.out.println("findNthElementInFibonacciSeries : "+ findNthElementInFibonacciSeries(10));
        System.out.println("isIsogram : "+ isIsogram("hi"));
        System.out.println("findFizzBuzzUsingBoolean : " + findFizzBuzzUsingBoolean(10));
        System.out.println("findFizzBuzzUsingIfElse : " + findFizzBuzzUsingIfElse(10));
        System.out.print("findFizzBuzzUsingTernary : "+ findFizzBuzzUsingTernary(10));
        System.out.println();
        System.out.println("findHowManyAlphabet : "+ findHowManyAlphabet("My name is harshita singh"));
        System.out.println("findAllAlphabetsPresentInString : "+ findAllAlphabetsPresentInString("a bbb cdefghijklmnopppqrrsttuvwxyz"));
        System.out.println("getUniqueCharacterSubStringBruteForce : "+ getUniqueCharacterSubStringBruteForce("pwwkew"));
        System.out.println("convertArrayStringIntoArrayListString : "+ convertArrayStringIntoArrayListString(strArray));
        System.out.println("convertArrayListStringIntoArrayString : "+ convertArrayListStringIntoArrayString(values));
        System.out.println("convertArrayListStringIntoArrayString2 : "+ convertArrayListStringIntoArrayString2(values));
        System.out.println("findLargestDoubleDigitFromString : "+ findLargestDoubleDigitFromString("50552"));
        //System.out.println("firstMissingPositiveNumber : "+ firstMissingPositiveNumber(intArray));
        //System.out.println("firstMissingPositiveNumber2 : "+ firstMissingPositiveNumber2(new int[] {2,3,5}));
        System.out.println("sortAscendingEmpUsingCollection : "+sortAscendingEmpUsingCollection(employeeList));
        System.out.println("sortDescendingEmpUsingCollection : "+sortDescendingEmpUsingCollection(employeeList));
        System.out.println("sumOfElementsUsingStrean : "+ sumOfElementsUsingStrean(intList));
        System.out.println("removeDuplicate : "+removeDuplicate(values));
        System.out.print("removeDuplicateUsingSet : "); removeDuplicateUsingSet(intList);
        System.out.println("twoSumsWithHashMap : "+ Arrays.toString(twoSumsWithHashMap(new int[] {2,7,11,15}, 9)));
	}
	
	//001
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
	//002
	public static String reverseString(String s1) {
		String reverse = "";
		for(int i =s1.length()-1; i >=0; i--) {
			reverse+=s1.charAt(i);
		}
		return reverse;
	}

	//003
	public static boolean checkPalindromeString(String s1) {
		String palindrome = "";
		for(int i = s1.length()-1; i>=0; i--) {
			palindrome+=s1.charAt(i);
		}
		return s1.equals(palindrome);
	}
	
	//004
	public static boolean checkPalindromeNumber(int num) {
		int reverseNum =0, temp=num;
		while(num>0) {
		reverseNum = (reverseNum * 10) + num % 10;
		num = num/10;
		}
		if(reverseNum == temp) {return true;}
		else {return false;}
		
	}
	
	//005
	public static void getAscendingListOfString(List<String> list) {	
		list.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach(i -> System.out.println(i));	
		list.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		
		
	}
	
	//006
	public static void getDescendingListOfString(List<String> list) {
		 list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList())
				.forEach(i -> System.out.println(i));	
		 
	}
	
	//007
	public static void getAscendingEmployeeNameList(List<Employee> empList) {
		empList.stream()
		       .sorted(Comparator.comparing(Employee::getName))
		       .collect(Collectors.toList())
		       .forEach(i -> System.out.println(i.getName()+ " "+i.getAge()+ " "+ i.getSalary()));
	}
	
	//008
	public static void getDescendingEmployeeNameList(List<Employee> empList) {
		empList.stream()
		       .sorted(Comparator.comparing(Employee::getName).reversed())
		       .collect(Collectors.toList())
		       .forEach(i -> System.out.println(i.getName()+ " "+i.getAge()+ " "+ i.getSalary()));
	}
	
	//009
	public static void getAscendingEmployeeAgeList(List<Employee> empList) {
		empList.stream()
		       .sorted(Comparator.comparingInt(Employee::getAge))
		       .collect(Collectors.toList())
		       .forEach(i -> System.out.println(i.getName()+ " "+i.getAge()+ " "+ i.getSalary()));
	}
	
	//010
	public static void getDescendingEmployeeAgeList(List<Employee> empList) {
		empList.stream()
		       .sorted(Comparator.comparingInt(Employee::getAge).reversed())
		       .collect(Collectors.toList())
		       .forEach(i -> System.out.println(i.getName()+ " "+i.getAge()+ " "+ i.getSalary()));
	}
	
	//011
	public static void getAscendingEmployeeSalaryList(List<Employee> empList) {
		empList.stream()
		       .sorted(Comparator.comparingDouble(Employee::getSalary))
		       .collect(Collectors.toList())
		       .forEach(i -> System.out.println(i.getName()+ " "+i.getAge()+ " "+ i.getSalary()));
	}
	
	//012
	public static void getDescendingEmployeeSalaryList(List<Employee> empList) {
		empList.stream()
		       .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		       .collect(Collectors.toList())
		       .forEach(i -> System.out.println(i.getName()+ " "+i.getAge()+ " "+ i.getSalary()));
	}
	
	//013
	public static long getMinFromListOfInteger(List<Integer> list) {
		return list.stream()
		           .min(Comparator.comparing(Integer::valueOf))
		           .get();
	}
	
	//014
	public static long getMaxFromListOfInteger(List<Integer> list) {
		return list.stream()
				.max(Comparator.comparingInt(Integer::valueOf))
				.get();
	}
	
	//015
	public static Map<String, Long> countDuplicateString(List<String> list){
		return list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
	
	//016
	public static Map<String, Long> countDuplicateString2(String str){
		return Arrays.asList(str.split(" ")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
	
	//017
	public static void characterCount(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i =0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	//018
	public static void getEmployeeNameStartsWithM(List<Employee> empList) {
		empList.stream()
        .filter(employee -> employee.getName().startsWith("M"))
        .forEach(System.out::println); 
	}
	
	//019
	public static boolean printTrueIfSalaryGreaterThan1000(List<Employee> empList) {
		return empList.stream().allMatch(e -> e.getSalary() > 1000 );
	}
	
	//020
	public static void gropuingByUSandNonUSPerson(List<Person> personList){
		personList.stream()
				.collect(Collectors.groupingBy(p -> p.getCountry().equals("US"), Collectors.toList()))
				.forEach((k,v) -> System.out.println(k + " "+v));
	}
	
	//021
	//How many male and female employees are there in the organization?
	public static Map<String, Long> groupingByGender(List<Employee> employeeList){
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	}
	
	//022
	//Print the name of all departments in the organization?
	public static void printDistinctDepartmentNames(List<Employee> employeeList) {
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(e -> System.out.println(e));
	}
	
	//023
	//What is the average age of male and female employees?
	public static Map<String, Double> averageAgeMaleFemaleEmployees(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
	}
	
	
	//024
	//Get the details of highest paid employee in the organization?
	public static Optional<Employee> getHighestPayingEmployee(List<Employee> employeeList) {
		return employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.findFirst();
	}
	
	//025
	public static boolean isBracketBalancedUsingStack(String s) {
		if(s == null || s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack();
		for(int i =0; i < s.length(); i++) {
			char current = s.charAt(i);
			if(current == '(' || current == '{' || current == '[') {
				stack.push(current);
			} else if(current == ')' || current == '}' || current == ']'){
				if(stack.isEmpty()) {
					return false;
				} else {
					char lastElement = stack.pop();
					if(lastElement == '(' && current != ')') {
						return false;
					} else if(lastElement == '{' && current != '}') {
						return false;
					} else if(lastElement == '[' && current != ']') {
						return false;
					}
				}
			}
			
		}
		return stack.isEmpty();
	}
	
	//026
	//badc
	public static String sortStringWithoutUsingSortFunc(String s) {
		char[] ch = s.toLowerCase().toCharArray();
		char temp;
		for(int i =0; i < ch.length; i++) {
			for(int j = i; j < ch.length; j++) {
				if(ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				} else {
					continue;
				}
			}
		}
		return Arrays.toString(ch);
	}
	
	//027
	public static List<Integer> getMinimalSubsetOfMaximumSum(List<Integer> list){
		Collections.sort(list); 
		Collections.reverse(list);
		int i=0;
		for(; i < list.size(); i++) {
			int sumA = list.subList(0, i+1).stream().collect(Collectors.summingInt(Integer::intValue)).intValue();
			int sumB = list.subList(i+1, list.size()).stream().collect(Collectors.summingInt(Integer::intValue)).intValue();
			if(sumA > sumB) {
				return list.subList(0, i+1);
			} else {
				continue;
			}
		}
		return list.subList(i+1, list.size());
	}
	
	//028
	public static List<Integer> getMinimalSubsetOfMaximumSum2(List<Integer> list){
		Collections.sort(list); Collections.reverse(list);
		List<Integer> newList = new ArrayList<>();
		int sumOfSubsetA =0, sumOfSubsetB =0;
		for(int start = 0; start < list.size(); start++) {
			newList.add(list.get(start));
			sumOfSubsetA += newList.get(start);
			int next = start+1;
			for(; next < list.size(); next++) {
				sumOfSubsetB += list.get(next);
			}
			if(sumOfSubsetA > sumOfSubsetB) {
				return newList;
			} else {
				sumOfSubsetB = 0;
				continue;
			}
		}
		return newList;
	}
	
	//029
	public static List<Integer> getMinimalSubsetOfMaximumSum3(List<Integer> list){
		Collections.sort(list); Collections.reverse(list);
		int sum = list.stream().collect(Collectors.summingInt(Integer::intValue)).intValue();
		List<Integer> newList = new ArrayList<>();
		int minimalSetSum=0;
		for(int i=0; i<list.size(); i++) {
			minimalSetSum += list.get(i);
			newList.add(list.get(i));
			if(minimalSetSum > (sum - minimalSetSum) ) {
				return newList;
			} else {
				continue;
			}
		}
		return newList;
	}
	
	//030
	public static String shiftELements(String s, int shiftBy) {
		int maxLength = s.length();
		return s.substring(maxLength - shiftBy, maxLength).concat(s.substring(0, maxLength - shiftBy));
	}
	
	//031
	public static boolean isCircular(String s) {
		String circular = "abcdefgh";
		String newCircular = circular.concat(circular);
		if(newCircular.contains(s)) {
			return true;
		} else {
			return false;
		}
	}
	
	//032
	public static String findWinner(String s) {
		int bobMoves=0, wendyMoves = 0;
		int length = s.length();
		int i = 0;
		while(i < length) {
			int j = i, count =0;
			//to get the count
			while( j < length && s.charAt(i) == s.charAt(j)) {
				count++; j++;
			}
			if(count > 2) {
				if(s.charAt(i) == 'w') {
					wendyMoves+=count - 2;
				} else {
					bobMoves += count - 2;
				}
			}
			i = j;
		}
		if(bobMoves > wendyMoves) {
			return "bob";
		} else {
			return "wendy";
		}
	}
	
	//033
	public static void printVanEckSequence(int n) {
		List<Integer> van = new ArrayList<>();
		int id =0, lastId =0, current=0;
		van.add(0);
		System.out.print("0");
		
		for(int i =0; i < n ; i++) {
			lastId = van.subList(0, id).lastIndexOf(van.get(id));
			if(lastId == -1) {
				van.add(0);
				System.out.print(", 0");
			} else {
				current = id - lastId;
				van.add(current);
				System.out.print(", "+ current);
			}
			id++;
		}
		System.out.println();
	}
	
	//034
	public static List<Employee> findEmployeeWLowestSalary(List<Employee> empList) {
		return empList.stream().collect(Collectors.groupingBy(Employee::getSalary, TreeMap::new, Collectors.toList())).firstEntry().getValue();
	}
	
	//035
	public static Employee findEmployeeWLowestSalary2(List<Employee> empList){
		return empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst().get();
	}
	
	//036
	public static Map<Integer, Map<String, List<Object>>> incrementByTenWhoseAgeIsGreatherThanThirty(List<Employee> empList){
		return empList.stream().filter(e -> e.getAge() > 30)
				.collect(Collectors.groupingBy(Employee::getAge,
						Collectors.groupingBy(Employee::getName, 
								Collectors.mapping(e -> (e.getSalary() + (e.getSalary()*10)/100), 
										Collectors.toList()))));
	}	
	
	//037
	public static Map<Integer, List<String>> sortEmployeesUsingId(List<Employee> empList){
		return empList.stream().collect(Collectors.groupingBy(Employee::getId, Collectors.mapping(Employee::getName, Collectors.toList())));
	}
	
	//038
	public static void sortIDinAscendinginMap(Map<Integer, Employee> empMap){
		 empMap.entrySet().stream().sorted(Map.Entry.<Integer, Employee>comparingByKey()).forEach(System.out::print);
		 System.out.println();
	}
	
	//039
	public static void sortIDinAscendinginMap2(Map<Integer, Employee> empMap) {
		TreeMap<Integer, Employee> treeMap = new TreeMap<>();
		treeMap.putAll(empMap);
		for(Map.Entry<Integer, Employee> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
	}
	
	//040
	//sort and reverse an array of int
	public static void sortIntArrayUsingStream(int[] intArray){
		int[] newIntArray =  Arrays.stream(intArray).sorted().distinct().toArray();
		for(int i : newIntArray) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//041
	public static void sortDescIntArrayUsingStream(int[] intArray) {
		IntStream.of(intArray)
		.boxed()
		.sorted(Comparator.reverseOrder())
		.distinct()
		.collect(Collectors.toList())
		.forEach(i -> System.out.print(i+" "));
		
		System.out.println();
	}
	
	//042
	//doubt
	public static void printAllMissingNumbers(int[] intArray) {
		int diff = intArray[0];
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] - i != diff) {
				while(intArray[i] - i > diff) {
					System.out.print((i+diff)+" ");
					diff++;
				}
			}
		}
		System.out.println();
	}
	
	//043
	//find min and max
	//take 2 variables left right  
	//if min is negative multiply min by -1, add n = fleft
	//if min is positive n - min = fleft
	//if max is negtive multiply max by -1, add n = fright
	//if max is positive max - n = fright
	public static int getFarthestElement(int[] intArray, int n) {
		int minimum = IntStream.of(intArray).boxed().min(Comparator.comparingInt(Integer::intValue)).get();
		int maximum = IntStream.of(intArray).boxed().max(Comparator.comparingInt(Integer::intValue)).get();
		int farLeft =0, farRight=0;
		if(n > 0) {
		  if(minimum < 0) {
			farLeft = (minimum * -1) +n;
		  } else if(minimum > 0) {
			  farLeft = n - minimum;
		  } else if(maximum < 0) {
			  farRight = (maximum * -1) + n;
		  } else {
			  farRight = maximum - n;
		  }
		}
		if(farLeft > farRight) {
			return minimum;
		} else {
			return maximum;
		}
	}
	
	//044
	//72035
	public static String replaceZeroToOne(int n) {
		Integer integerValue = Integer.valueOf(n);
		String integerStringValue = integerValue.toString();
		return integerStringValue.replaceAll("0", "1");
	}
	
	//045
	public static int sumOfOddIntegerAndSquaring(List<Integer> list) {
		return list.stream().filter(i -> i % 2 != 0).mapToInt(i -> i *i).sum();
	}
	
	//046
	public static List<Integer> findIndexOfALetter(String s, char ch) {
		//harshita
		List<Integer> index = new ArrayList<>();
		for(int i =0; i < s.length(); i++) {
			char newCh = s.charAt(i);
			if(newCh == ch) {
				index.add(i);
			} else {
				continue;
			}
		}
		return index;
	}
	
	//047
	public static int findMaxArraySizeAmericanExpress(int x, int y, int[] a) {
		int result = -1;
		int size = a.length;
		int nX =0, nY =0;
		
		if(size >= 1) {
			for(int i =0; i < size; i++) {
				if(a[i] >= 1) {
					if(a[i] == x) {
						nX+=1;
					} else if(a[i] == y) {
						nY+=1;
					}
					if(nX == nY) {
						result = i;
					}
				}
			}
		}
		return result;
	}
	
	//048
	public static String stringReverseUsingStringBuilder(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	//049
	public static void sortArrayWithoutUsingPreDefinedFunc(int[] nums) {
		//first take i and j
		// compare i and j 
		//if i < j j-- i++
		//if i > j swap, 
		int i =0, j = nums.length-1;
		while(i <=j && i < nums.length-1 && j >0) {
			if(nums[i] == 0 || nums[j] == 0 || nums[i] == 1 || nums[j] ==1 ) {
				if(nums[i] > nums[j]){
				   int temp = nums[i];
				   nums[i] = nums[j];
				   nums[j] = temp;
				   i++; j--;
				} else if(nums[i] < nums[j]) {
				          i++; j--;
				} else if(nums[i] ==0 && nums[j] ==0) {
					      i++;
				} else {
					j--;
				}
				}
		}
		for(int value : nums) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	//050
	public static String reverseMiddleString(String str) {
		String[] strArray = str.split(" ");
		int middleNum = strArray.length/2;
		String middleValue = strArray[middleNum];
		String sb = new StringBuilder(middleValue).reverse().toString();
		return sb;
		
	}
	
	//051
	public static Map<Object, List<Object>> getEmpNameWhoAreMale(List<Employee> list) {
		return list.stream().collect(Collectors.groupingBy(e -> e.getGender().equals("Male"),
				Collectors.mapping(e -> e.getName(), Collectors.toList())));
	}

	//052
	public static List<String> findDistinctValues(List<String> list){
		return list.stream().distinct().collect(Collectors.toList());
	}
	
	//053
	public static Map<String, Long> findOccurenceOfEachElement(List<String> list){
		return list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	
	//054
	public static void getTopTwoElements(List<String> list) {
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Entry<String, Long> firstValue = map.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).findFirst().get();
		Entry<String, Long> secondValue = map.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).skip(1).findFirst().get();
		
		System.out.print("FirstValue : "+ firstValue.getKey()+ " "+firstValue.getValue());
		System.out.println(", SecondValue : "+ secondValue.getKey()+ " "+secondValue.getValue());
		System.out.println();
	}
	
	//055
	public static void checkStringEquals(String s1, String s2) {
		System.out.println("s1.equals(s2) : "+ s1.equals(s2));
		System.out.println("s1 == s2 : "+ s1 == s2);
		System.out.println("s1 + s2 : "+ s1 + s2);
	}
	
	//056
	public static boolean findSimultaneoulsyBracket(String s) {
		String replaceSpaces = s.replaceAll(" ", "");
		System.out.println("replaceSpaces : "+ replaceSpaces);
		if(replaceSpaces.contains("()")) {	
			return true;
		}
		else {
			return false;
		}
	}
	
	//057
	public static String findLongestEvenString(String s) {
		String[] strArr = s.split(" ");
		System.out.println("strArr.length : "+ strArr.length);
		int maxLength =0; String result="";
		for(int i =0; i < strArr.length; i++) {
			if(strArr[i].length() % 2 == 0 && strArr[i].length() > maxLength) {
				maxLength = strArr[i].length();
				result = strArr[i];
			}
		}
		return result;
	}
	
	//058
	public static int findSecondHighestNumber(int[] arr) {
		Integer newArr = IntStream.of(arr).boxed().distinct().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst().get();
		return newArr.intValue();
	}
	
	//059
	public static int findSecondHighestNumber2(int[] arr) {
		int[] newArr =  Arrays.stream(arr).distinct().sorted().toArray();
		return newArr[newArr.length - 2];
	}
	
	//060
	public static List<String> mergeTwoLists(List<String> list1, List<String> list2){
		List<String> list = new ArrayList<>();
		 list.addAll(list1);
		 list.addAll(list2);
		 return list;
	}
	
	//061
	public static void sortHashMapByKey(Map<Integer, Employee> empMap) {
		empMap.entrySet().stream().sorted(Map.Entry.<Integer,Employee>comparingByKey()).forEach(System.out::println);
	}
	
	//062
	public static void sortHashMapByValue(Map<Integer, Employee> empMap) {
		empMap.entrySet().stream().sorted(Map.Entry.<Integer,Employee>comparingByValue(Comparator.comparing(Employee::getName))).forEach(System.out::println);
	}
	
	//063
	public static void sortHashMapByValue2(Map<Integer, Employee> empMap) {
		empMap.entrySet().stream().sorted(Map.Entry.<Integer,Employee>comparingByValue(Comparator.comparing(Employee::getId))).forEach(System.out::println);
	}
	//063
	public static void sortHashMapByValue3(Map<Integer, Employee> empMap) {
		empMap.entrySet().stream().sorted(Map.Entry.<Integer,Employee>comparingByValue(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
	}
	
	//064
	public static int findLargestSum(int[] numArr) {
		int sum =0, maxSum = 0;
		for(int i =0; i < numArr.length; i++) {
			if(numArr[i] > sum || sum >= 0) {
				sum+=numArr[i];
				if(sum > maxSum) {
					maxSum = sum;
				} 
			 } else if(numArr[i] < 0) {
					sum+=numArr[i];
					if(sum < 0) {
					    sum=0;
					} 
				}
		}
	    return maxSum;
	}
	
	//065
	public static int reverseNum(int num) {
		int temp =0;
		while(num > 0) {
			temp = temp * 10 + num % 10;
			num = num /10;
		}
		return temp;
	}
	
	//066
	//filter the person's country 
	public static Map<Object, List<Object>> getPersonNameFromCountry(List<Person> personList){
		return personList.stream().collect(Collectors.groupingBy(p -> p.getCountry().equals("US"), Collectors.mapping(p -> p.getName(), Collectors.toList())));
	}
	
	//067
	//check if two arrays contains same elements
	public static boolean checkSameElementsInTwoArrays(Object[] array1, Object[] array2) {
		Set<Object> uniqueElement1 = new HashSet<>(Arrays.asList(array1));
		Set<Object> uniqueElement2 = new HashSet<>(Arrays.asList(array2));
		
		if(uniqueElement1.size() != uniqueElement2.size()) {
			return false;
		}
		for(Object obj : uniqueElement1) {
			if(!uniqueElement2.contains(obj)) {
				return false;
			}
		}
		return true;
	}
	
	//068
	//shuffle an array in java
	public static String shuffleAnArray(int[] intArray) {
		Random random = new Random();
		
		for(int i =0; i < intArray.length; i++) {
			int randomIndexToSwap = random.nextInt(intArray.length);
			int temp = intArray[randomIndexToSwap];
			intArray[randomIndexToSwap] = intArray[i];
			intArray[i] = temp;
		}
		return Arrays.toString(intArray);
	}
	
	//069
	//print date in specific format
	public static String printDateInSpecifiedFormat(String pattern) {
		//String pattern = "MM-DD-YYYY";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		return date;
	}
	
	//070
	public static String removeAllOccurenceOfAinString(String s) {
		return s.toLowerCase().replaceAll("a", "");
	}
	
	//071
	public static void getDistinctCharAndCountUsingHashMap(String s) {
		char[] ch = s.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
			map.put(c, 1);
			}
		}
		for(Map.Entry entry : map.entrySet()) {
	        System.out.println("entry.getKey() : "+ entry.getKey()+", entry.getValue() : "+ entry.getValue());
		}
	}
	
	//072
	public static void proveStringIsImmutable() {
		//"Java" string created in pool and reference assigned to s1
		String s1 = "Java";
		
		//s2 is also having reference to "Java" in the pool
		String s2 = s1;
		//proof that s1 & s2 have same reference
		System.out.println("s1 == s2 : "+s1 == s2);
		
		//In this case, a new string "Python" got created in the pool, but the original
		//string "Java" is still unchanged and remains in the pool
		//s2 is still referencing to the original String "Java" in the pool
		s1 = "Python";
		
		// proof that s1 and s2 have diff reference
		System.out.println("s1 == s2 : "+ s1 == s2);
		
		//prints java, supporting the fact that original string value is unchanged,
		//hence the string is immutable
		System.out.println("s2 : "+s2);
		
	}
	
	//073
	public static List<Integer> compareTwoListsOfInteger(List<Integer> firstList, List<Integer> secondList){
		return firstList.stream().filter(secondList::contains).collect(Collectors.toList());
	}
	
	//074
	public static List<String> compareTwoListsOfStrings(List<String> firstList, List<String> secondList){
		return firstList.stream().filter(secondList::contains).collect(Collectors.toList());
	}
	
	//075
	public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
		Collections.reverse(list);
		return list;
	}
	
	//076
	public static String sortingArray(int[] arr) {
		Arrays.sort(arr);
		return Arrays.toString(arr);
	}
	
	//077
	public static int[] sortingArray2(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	
	//078
	//remove leading and trailing spaces
	public static String leadingTrailingSpace(String str) {
		return str.trim();
	}
	
	//079
	public static String removeWhiteSpaces(String str) {
		return str.replaceAll(" ", "");
	}
	
	//080
	public static List<Integer> getEvenNumber(List<Integer> list){
		return list.stream().distinct().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}
	
	//081
	public static boolean containsOnlyOddNumber(List<Integer> list) {
		return list.stream().allMatch(i -> i%2 !=0);
	}
	
	//082
	public static void printFibonacciSeries(int count) {
		int a =0, b=1, c=1;
		for(int i =0; i < count; i++) {
			System.out.println(a+ " ");
			a = b;
			b = c;
			c = a+b;	
		}
	}
	
	//083
	public static boolean isPrime(int n) {
		if(n==0 || n ==1) return false;
		if(n==2) return true;
		for(int i =2; i < n/2; i++) {
			if(n%2 == 0) return false;
		}
		return true;
	}
	
	//084
	public static boolean isVowelPresent(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}
	
	//085
	public static void swapNumbers(int a, int b) {
		b = b + a;
		a = b - a;
		b = b - a;
		System.out.println("a : "+a+", b : "+b);
	}
	
	//086
	public static void intArrayReverse(int[] intArray) {
		for(int i = intArray.length-1; i>=0; i--) {
			System.out.print(intArray[i]+ " ");
		}
		System.out.println();
	}
	
	//087
	public static void stringArrayReverse(String[] strArray) {
		for(int i = strArray.length-1; i>=0; i--) {
			System.out.print(strArray[i].toString() + " ");
		}
		System.out.println();
	}
	
	//088
	public static String reverseUsingChar(String str) {
		String reverse ="";
		for(int i = str.length()-1; i >=0; i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
	}
	
	//089
	public static Map<String, List<Person>> getListOfPersonsByCountry(List<Person> personList){
		return personList.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.toList()));
	}
	
	//OR
	//090
	public static Map<String, List<Person>> getListOfPersonsByCountry2(List<Person> personList){
		return personList.stream().collect(Collectors.groupingBy(p -> p.getCountry(), Collectors.toList()));
	}
	
	//091
	public static Map<String, Long> getCountOfPeopleFromDistinctCountry(List<Person> personList){
		return personList.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.counting()));
	}
	
	//OR
	//092
	public static Map<String, Long> getCountOfPeopleFromDistinctCountry2(List<Person> personList){
		return personList.stream().collect(Collectors.groupingBy(p -> p.getCountry(), Collectors.counting()));
	}
	
	//093
	public static Map<String, List<String>> getNamesOfPersonFromDistinctCountry(List<Person> personList){
		return personList.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.mapping(Person::getName, Collectors.toList())));
	}
	
	//OR
	//094
	public static Map<String, List<String>> getNamesOfPersonFromDistinctCountry2(List<Person> personList){
		return personList.stream().collect(Collectors.groupingBy(p -> p.getCountry(), Collectors.mapping(p -> p.getName(), Collectors.toList())));
	}
	
	//095
	public static Map<Boolean, Long> getUSNonUSTrueFalse(List<Person> personList){
		return personList.stream().collect(Collectors.partitioningBy(p -> p.getCountry().equals("US"), Collectors.counting()));
	}
	
	//096
	public static Map<Boolean, List<String>> getUSNonUSTrueFalseWithNames(List<Person> personList){
		return personList.stream().collect(Collectors.partitioningBy(p -> p.getCountry().equals("US"), Collectors.mapping(p -> p.getName().toUpperCase(), Collectors.toList())));
	}
	
	//097
	public static Map<Boolean, List<Person>> getUSNonUSTrueFalseWithListOfPerson(List<Person> personList){
		return personList.stream().collect(Collectors.partitioningBy(p -> p.getCountry().equals("US"), Collectors.toList()));
	}
	
	//098
	public static void convertIntegerArrayListToIntArray(List<Integer> list) {
		int[] intArray = new int[list.size()];
		for(int i =0; i < intArray.length; i++) {
			intArray[i] = list.get(i).intValue();
		}
		for(int i : intArray) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//099
	public static List<Integer> convertIntArrayToIntegerArrayList(int[] intArray){
		List<Integer> list = new ArrayList<>(intArray.length);
		for(int i : intArray) {
			list.add(i);
		}
		return list;
	}
	
	//100
	public static int findSecondHighestNumberFromList(List<Integer> list) {
		return list.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1).findFirst().get().intValue();
	}
	
	//101
	public static int findNthElementInFibonacciSeries(int n) {
		if( n <= 1) {
			return n;
		} else {
			return findNthElementInFibonacciSeries(n-1) + findNthElementInFibonacciSeries(n-2);
		}
	}
	
	//102
	public static boolean isIsogram(String s) {
		char[] ch = s.toLowerCase().toCharArray();
		Set<Character> set = new HashSet<>();
		for(int i =0; i < ch.length; i++) {
			if(set.contains(ch[i])) {
				return false;
			}
			set.add(ch[i]);
		}
		return true;
	}
	
	//103
	public static List<String> findFizzBuzzUsingBoolean(int n){
		List<String> list = new ArrayList<>();
		if( n > 0 && n <=100) {
			for(int i = 1; i <=n ; i++) {
				boolean divisibleBy3 = (i%3 == 0);
				boolean divisibleBy5 = (i%5 == 0);
				
				if(divisibleBy3 && divisibleBy5) {
					list.add("FizzBuzz");
				} else if(divisibleBy3) {
					list.add("Fizz");
				} else if(divisibleBy5) {
					list.add("Buzz");
				} else {
					list.add(Integer.toString(i));
				}
			}
		}
		return list;
	}
	
	//104
	public static List<String> findFizzBuzzUsingIfElse(int n){
		List<String> list = new ArrayList<>();
		if(n > 0 && n <=100) {
			for(int i =1; i <= n; i++) {
				if((i%3 == 0) && (i%5 == 0)) {
					list.add("FizzBuzz");
				} else if(i%3 == 0) {
					list.add("Fizz");
				} else if(i%5 == 0) {
					list.add("Buzz");
				} else {
					list.add(Integer.toString(i));
				}
			}
		}
		return list;
	}
	
	//105
	public static List<String> findFizzBuzzUsingTernary(int n) {
		List<String> list = new ArrayList<>();
		if(n>0 && n<=100) {
			for(int i =1; i <= n; i++) {
				String result = ((i%3==0 && i%5==0) ? "FizzBuzz" : (i%3==0) ? "Fizz" : (i%5==0) ? "Buzz" : Integer.toString(i));
				list.add(result);
			}
		}
		return list;
	}
	
	//106
	public static long findHowManyAlphabet(String s) {
		//long c = s.toLowerCase().chars().filter(ch -> (ch >= 'a' && ch <= 'z')).distinct().count();
		return s.toLowerCase().chars().filter(ch -> (ch >= 'a' && ch <= 'z')).distinct().count();
	}
	
	//107
	public static boolean findAllAlphabetsPresentInString(String s) {
		long c = s.toLowerCase().chars().filter(ch -> (ch >= 'a' && ch <= 'z')).distinct().count();
		return (c == 26);
	}
	
	//108
	public static String getUniqueCharacterSubStringBruteForce(String s) {
		String result = "";
		
		for(int start=0; start < s.length(); start++) {
			Set<Character> set = new HashSet<>();
			int end = start;
			for(; end < s.length(); end++) {
				 char current = s.charAt(end);
				 if(set.contains(current)) {
					 break;
				 } else {
					 set.add(current);
				 }
			}
			if(result.length() < end - start + 1) {
				result = s.substring(start, end);
			}
		}
		return result;
	}
	
	//109
	public static List<String> convertArrayStringIntoArrayListString(String[] s) {
		List<String> list = Arrays.asList(s);
		return list;
	}
	
	//110
	public static String convertArrayListStringIntoArrayString(List<String> list) {
		String[] s = new String[list.size()];
		for(int i =0; i < list.size(); i++) {
			s[i] = list.get(i);
		}
		return Arrays.toString(s);
	}
	
	//111
	public static String convertArrayListStringIntoArrayString2(List<String> list) {
		String[] s  = list.toArray(new String[list.size()]);
		return Arrays.toString(s);
	}
	
	//112
	public static int findLargestDoubleDigitFromString(String s) {
		int max = 0;
		char[] ch = s.toCharArray();
		for(int i = 1; i < s.length(); i++) {
			int current = (ch[i - 1] - '0') * 10 + (ch[i] - '0');
			if(current > max) {
				max = current;
			}
		}
		return max;
	}
	
	//113
	public static int firstMissingPositiveNumber(int[] nums) {
		int size = nums.length;
		for(int i = 0; i < size; i++) {
			while((nums[i] >= 1 && nums[i]<size) && (nums[i]-1 != nums[i])) {
				int temp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = temp;
			}
		}
		for(int i = 0; i <size; i++) {
			if(nums[i] != i+1)
				return i+1;
		}
		return size+1;
	}
	
	//114
	public static int firstMissingPositiveNumber2(int[] nums) {
		int size = nums.length;
		Arrays.sort(nums);
		for(int i = 0; i < size; i++) {
			if(nums[i] != i+1) {
				return i+1;
			}
		}
		return size+1;
	}
	
	//115
	public static List<Employee> sortAscendingEmpUsingCollection(List<Employee> empList) {
		Collections.sort(empList, (e1,e2) -> e1.getId() - e2.getId());
		return empList;
	}
	
	//116
	public static List<Employee> sortDescendingEmpUsingCollection(List<Employee> empList) {
		Collections.sort(empList, (e1,e2) -> e2.getId() - e1.getId());
		return empList;
	}
	
	//117
	public static int sumOfElementsUsingStrean(List<Integer> list){
		return list.stream().collect(Collectors.summingInt(Integer::intValue)).intValue();
	}
	
	//118
	public static List<String> removeDuplicate(List<String> list){
	    return list.stream().distinct().collect(Collectors.toList());
	}
	
	//119
	public static void removeDuplicateUsingSet(List<Integer> list) {
		Set<Integer> set = new HashSet<>(list);
		List<Integer> withoutDuplicateList = new ArrayList<>(set);
		Iterator<Integer> itr = withoutDuplicateList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		System.out.println();
	}
	
	//120
	public static int[] twoSumsWithHashMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i < nums.length; i++) {
			int secondNumber = target - nums[i];
			if(map.containsKey(secondNumber)) {
				return new int[] {map.get(secondNumber), i};
			} else {
				map.put(nums[i], i);
			}
		}
		throw new IllegalArgumentException("No such numbers found");
	}
}
