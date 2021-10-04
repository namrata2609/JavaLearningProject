import net.sf.saxon.ma.map.HashTrieMap;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private Map<Character, TrieNode> table;
    private boolean isWord;
    TrieNode(){
        this.table = new HashMap<>();
        isWord = false;

    }
    public boolean haveRecord(char c){
        return this.table.containsKey(c);

    }
    public boolean hasNoRecord (){
        return this.table.isEmpty();
    }
    public TrieNode followChar (char c){
        return this.table.get(c);
    }

    public void addRecord (char c,TrieNode n){
        this.table.put(c,n);
    }

    public void deleteRecord (char c){
        this.table.remove(c);
    }

    public boolean isWord (){
        return isWord;
    }

    public void setWord(boolean isWord){
        this.isWord = isWord;
    }
}
