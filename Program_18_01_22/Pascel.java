class Solution {
    public List<List<Integer>> generate(int n) {
        if(n==1){
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> a = new ArrayList<>();
            a.add(1);
            res.add(a);
            return res;
        }
        List<List<Integer>> pas = generate(n-1);
        List<Integer> b = new ArrayList<>();
        b.add(1);
        
        if(pas.size() > 0){
            List<Integer> c = pas.get(pas.size()-1);
            for(int i=0; i<c.size()-1; i++){
                b.add(c.get(i) + c.get(i+1));
            }   
        }
        b.add(1);
        pas.add(b);
        return pas;
    }
}