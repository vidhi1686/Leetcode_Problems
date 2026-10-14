// class Solution {
//     public int calPoints(String[] operations) {
//         ArrayList<Integer> record =new ArrayList<>();
        
       
//         for(int i=0; i<operations.length;i++){
//             String operation = operations[i];
//             if(operation.equals("C")){
//                 int lastindex =record.size()-1;
//                 record.remove(lastindex);
//             }
//             else if(operation.equals("D")){
//                 int lastindex =record.size()-1;
//                 record.add(record.get(lastindex)*2);
//             }
//             else if(operation.equals("+")){
//                 int lastindex =record.size()-1;
//                 int secondlast = record.size() -2;
//                  int sum1= record.get(lastindex) +record.get(secondlast);
//                 record.add(sum1);
//             }
//             else{
//                 record.add(Integer.parseInt(operation));
//             }

//             }
//             int result =0;
//             for(int score : record){
//                 result+=score;
//             }
//             return result;
//         }
        
        
//     }
import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                st.pop();
            }

            else if (op.equals("D")) {
                int x = st.peek();
                st.push(2 * x);
            }

            else if (op.equals("+")) {
                int last = st.pop();
                int secondLast = st.peek();

                st.push(last);
                st.push(last + secondLast);
            }

            else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}