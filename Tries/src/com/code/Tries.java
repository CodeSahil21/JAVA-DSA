package com.code;

public class Tries {

    private static class Node{
       Node children[] = new Node[26];
       Boolean eow = false;//eow=end of the word

       Node(){
           for (int i = 0;i<26;i++){
               children[i] = null;//initially we will keep values as null
           }
       }
   }

   public static Node root = new Node();
    public static void insert(String word){//ol
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
               int idx = word.charAt(level) - 'a';
               if(curr.children[idx] == null){
                    curr.children[idx] = new Node();
               }
               curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean  search(String word){
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
      return  curr.eow = true;

    }

    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any","thee"};
        for (int i = 0; i < words .length; i++) {
            insert(words[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}
