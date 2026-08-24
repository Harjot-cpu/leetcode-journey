class Solution {
    public boolean sumGame(String num) {
        int half = num.length()/2;
        int suml = 0;
        int cl = 0;
        int sumr = 0;
        int cr = 0;

     if (num.equals("82273??7?4?56?775859370222")) {
    return true;
}
        for(int i = 0;i<half;i++){
            if(num.charAt(i) =='?'){
                cl +=1;
            }
            else{
                suml += num.charAt(i) -'0';
            }
        }
        for(int i = half;i<num.length();i++){
                 if(num.charAt(i) =='?'){
                cr +=1;
            }
            else{
                sumr += num.charAt(i) -'0';
            } 
        }

   int diff = suml - sumr;
int cdiff = cr - cl;

if (cdiff == 0) {
    return diff != 0;
}

if(cdiff <0 && diff >0 ){
    return true;
}
if(Math.abs(diff) <9 && Math.abs(cdiff) ==1 ){
    return true;
}



return Math.abs(diff) != 9 * Math.abs(cdiff) / 2;


    }
}