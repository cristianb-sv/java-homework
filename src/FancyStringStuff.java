import java.util.*;

public class FancyStringStuff {

    public static void fancyStringThings() {
        // Asks for input of strings
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a string: ");
        String s1 = input.nextLine();
        System.out.println("Give me another string: ");
        String s2 = input.nextLine();
        // Concatenates strings
        String s3 = s1 + s2;

        // Compares strings
        if (s1.equals(s2)) {
            System.out.println("You gave me the same string twice");
        }
        System.out.println("Those two strings together look like this: " + s3);

        System.out.println("Give me a palindrome: ");
        String s4 = input.nextLine();

        // Let's reverse the string
        StringBuilder sb = new StringBuilder();
        sb.append(s4); // Adds string #4 to sb
        String s4r = String.valueOf(sb.reverse()); // Reverses the string

        // Checks if it's a palindrome
        if (s4.equals(s4r)) {
            System.out.println("Yup! It's a paindrome :D");
        } else {
            System.out.println("That's not a palindrome. According to Wikipedia: A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar.");
        }

        String e = "";

        String[] words = {};
        List<String> strings = new ArrayList<String>();
        strings.add("bzxWwA2TNO");
        strings.add("IpA4NJp1pO");
        strings.add("edRVXF3QXK");
        strings.add("1vWn2q8zuy");
        strings.add("FkrhxSU9NB");

        for (int i = 0; i < strings.size(); i++) { // begin checking if word starts with vowel
            if (Character.toLowerCase(strings.get(i).charAt(0)) == 'a' ||
                    Character.toLowerCase(strings.get(i).charAt(0)) == 'e' ||
                    Character.toLowerCase(strings.get(i).charAt(0)) == 'i' ||
                    Character.toLowerCase(strings.get(i).charAt(0)) == 'o' ||
                    Character.toLowerCase(strings.get(i).charAt(0)) == 'u') {
                e = e.concat(strings.get(i).toUpperCase(Locale.ROOT) + " "); // stop checking if word starts with vowel, transform and append it to empty string
            } else if (strings.get(i).contains("x") || strings.get(i).contains("X") || strings.get(i).length() < 3) { // begin checking if word contains x/X or if <3
                e = e.concat("skipped" + " "); // concatenate skipped if it meets those conditions
            } else if (!strings.get(i).contains("x") || !strings.get(i).contains("X")){ // begin checking if word doesn't contain x/X
                    e = e.concat(strings.get(i).toLowerCase(Locale.ROOT) + " "); // concatenate if conditions are met
                }
        }
        System.out.println(e);

        // Now for the hashmap thing
        HashMap<String, String> map = new HashMap<>();
        map.put("Name5", "email5@domain.com");
        map.put("Name2", "email2@domain.com");
        map.put("Name1", "email1@domain.com");
        map.put("Name3", "email3@domain.com");
        map.put("Name6", "email6@domain.com");
        map.put("Name4", "email4@domain.com");

        // Print size of map
        System.out.println("There are " + map.size() + " pairs in the map");
        // Check if name is in map + return email address
        System.out.println("Give me a name to check if it's present in the map: ");
        String name = input.nextLine();
        if (map.containsKey(name)){
            System.out.println("Yup, " + name + " is on the list and their email address is " + map.get(name));
        } else{
            System.out.println("Nope, " + name + " is not on the list");
        }
        // Deleting an entry
        System.out.println("Here's the map in the order that it is in now: " + map);
        System.out.println("Removing Name3 from the map");
        map.remove("Name3");
        // Sorting the map
        System.out.println("Here's the map again in the order that it is in now: " + map);
        Map<String, String> treeMap = new TreeMap<>(map); // Sorts the pairs by key
        System.out.println("Here's the map in the order that it is in now: " + treeMap);
    }
}
