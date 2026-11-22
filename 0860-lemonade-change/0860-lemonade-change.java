class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] !=5) return false;
        int fives=0,tens=0;
        for(int i=0; i<bills.length; i++){
            if(bills[i]==5) fives+=1;

            else if(bills[i]==10){
                if(fives>0){
                    fives--;tens++;
                }
                else return false;
            }

            else if(bills[i]==20){
                if(tens>0 && fives>0){
                    fives--;tens--;
                }
                else if(fives>=3){
                    fives-=3;
                }
                else return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna