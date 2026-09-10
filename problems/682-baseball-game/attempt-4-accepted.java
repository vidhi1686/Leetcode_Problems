class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> record =new ArrayList<>();
        
       
        for(int i=0; i<operations.length;i++){
            String operation = operations[i];
            if(operation.equals("C")){
                int lastindex =record.size()-1;
                record.remove(lastindex);
            }
            else if(operation.equals("D")){
                int lastindex =record.size()-1;
                record.add(record.get(lastindex)*2);
            }
            else if(operation.equals("+")){
                int lastindex =record.size()-1;
                int secondlast = record.size() -2;
                 int sum1= record.get(lastindex) +record.get(secondlast);
                record.add(sum1);
            }
            else{
                record.add(Integer.parseInt(operation));
            }

            }
            int result =0;
            for(int score : record){
                result+=score;
            }
            return result;
        }
        
        
    }
