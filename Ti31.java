package book.four;

import java.util.Stack;

public class Ti31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        boolean flag=false;
        Stack<Integer> A=new Stack<>();
        int i=0,j=0;
        /*if (pushed!=null&&popped!=null){
            while (i<popped.length-1){
                while (A.empty()||A.peek()!=popped[i]){
                    if (j==pushed.length-1)
                        break;
                    A.push(pushed[j]);
                    j++;
                }
                if (A.peek()!=popped[i])
                    break;
                A.pop();
                i++;
            }
            if (A.empty()&&i==popped.length-1)
                return flag=true;
        }*/
        for (int num:pushed){
            A.push(num);
            while (!A.empty()&&A.peek()==popped[i]){
                A.pop();
                i++;
            }
        }
        return A.empty();
    }
}
