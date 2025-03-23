package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        revString();
    }

    //Print Character count using hashmap
    public static void charCountUsingHashMap(){
        String name = "malayalam";
        name=name.toLowerCase();
        Map<Character,Integer> charCountMap = new HashMap<>();
        for(char ch: name.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                charCountMap.put(ch,charCountMap.getOrDefault(ch,0)+1);
            }
        }
        System.out.println("Character Counts: ");
        for(Map.Entry<Character,Integer> entry: charCountMap.entrySet()){
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }
    }

    //Print Character count without hashmap
    public static void charCountWithoutHashMap(){
        String name = "Hello";
        int[] count = new int[256];
        for(char ch:name.toCharArray()){
            count[ch]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>1){
                System.out.println((char)i+" - "+count[i]);
            }
        }
    }

    //Remove duplicate elements from ArrayList
    public static void removeDuplicateElementsFromArrayListUsingSet(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Apple","Mango"));
        HashSet<String> set = new HashSet<>(list);
        list=new ArrayList<>(set);
        System.out.println("List after duplicates: "+list);
    }

    //Remove duplicate elements from ArrayList using Streams
    public static void removeDuplicateElementsFromArrayListUsingStream(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Apple","Mango"));
        List<String> uniqueList = list.stream().distinct().toList();
        System.out.println("List: "+uniqueList);
    }

    //Remove duplicate elements from ArrayList without Sets and Streams
    public static void removeDuplicateElementsFromArrayList(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Apple","Mango"));
        ArrayList<String> uniqueList = new ArrayList<>();
        for(String n:list){
            if(!uniqueList.contains(n)){
                uniqueList.add(n);
            }
        }
        System.out.println("List: "+uniqueList);
    }

    //Remove Duplicate Elements From String Using LinkedHashSet
    public static void removeDuplicateElementsFromStringUsingLinkedHashSet(){
        String name = "programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char ch:name.toCharArray()){
            set.add(ch);
        }
        StringBuilder result = new StringBuilder();
        for(char ch:set){
            result.append(ch);
        }
        System.out.println("Result: "+ result);
    }

    //Remove Duplicate Elements From String Using Streams
    public static void removeDuplicateElementsFromStringUsingStreams(){
        String name = "programming";
        String result = name.chars()
                .distinct()
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println("Result: "+result);
    }

    //Print duplicates in an Array
    public static void duplicatesInArray(){
        String[] str = {"apple","mango","banana","apple"};
        Map<String,Integer> wordCount = new HashMap<>();
        for(String word:str){
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        System.out.println("Duplicates: ");
        for(Map.Entry<String,Integer> entry:wordCount.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" - "+entry.getValue());
            }
        }
    }

    //Reverse A String
    public static void revString(){
        String name = "admin";
//        char[] str = name.toCharArray();
//        for(int i=1; i<=str.length;i++) {
//            System.out.print(str[str.length - i]);
          for(int i=1;i<=name.length();i++){
              System.out.print(name.charAt(name.length()-i));
        }
    }

    //Rev String using StringBuilder
    public static void revStringUsingStringBuilder(){
        String name = "admin";
        String rev = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed: "+rev);
    }

}



