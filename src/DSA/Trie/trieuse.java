package DSA.Trie;

public class trieuse {
    public static void main(String[] args){
        Trie root = new Trie();
        root.add("new");
        root.add("sale");
        root.add("news");
//        System.out.println(root.search("new"));
        root.remove("new");
//        System.out.println(root.search("new"));
        System.out.println(root.search("news"));
        root.remove("new");
    }
}
