class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result =new ArrayList <> ();
        for (int i=0; i<numRows ;i++){
            List <Integer> currentRow =new ArrayList <> ();
            for(int pos=0 ; pos <= i ; pos++){
                if(pos==0 || pos==i){
                    currentRow.add(1);
                }
                else{
                    List<Integer> prevRow = result.get(i - 1);
                    int sum = prevRow.get(pos-1) + prevRow.get(pos);
                    currentRow.add(sum);
                }    
            }
            result.add(currentRow);

        }
        return result;
        
    }
}