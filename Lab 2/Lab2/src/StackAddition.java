public class StackAddition { //Problem 3
    public static int stackAddition( int n){
        Stack <Interger> s = new Stack<>();
        for (int i = 1; i <= n; i++){
            s.push(i);
        } //push 
        while (!s.isEmpty()){
            sum += s.pop(); //pop

        }

        
        return sum;
}
    public static void main (String [] args) {
        int n = 5;
        int result = stackAddition(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + result);
    }
}


