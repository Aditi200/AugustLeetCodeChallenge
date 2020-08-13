
class CombinationIterator {

    String c;
    int l, count = 0;
    
    List<String> list;
    
    public CombinationIterator(String characters, int combinationLength) {
        c = characters;
        l = combinationLength;
        list = new ArrayList<>();
        backtrack(list, c, l,0,"");
    }
    
    public static void backtrack(List<String> list, String c, int l, int i, String s){
        
        if(s.length()==l){
            list.add(s);
            return;
        }
       
        
        for(int j=i;j<c.length();j++){
            
            String r = s+ String.valueOf(c.charAt(j));
            
            backtrack(list, c, l, j+1, r);
            
        }
    }
    
    public String next() {
            String p =  list.get(count);
            count++;
            return p;
    }
    
    public boolean hasNext() {
        if(count<list.size()){
            return true;
        }
        return false;
    }
}