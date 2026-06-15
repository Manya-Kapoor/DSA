class Solution {
    static String[] below20 = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static String[] ten = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num) {
        if(num==0)
           return "Zero";
        return solve(num);
        
    }
    static String solve(int n)
    {
        StringBuilder sb = new StringBuilder();
        if(n<20)
        {
            sb.append(below20[n]);
        }
        else if(n<100)
        {
            sb.append(ten[n/10]).append(" ").append(below20[n%10]);
        }
        else if(n<1000)
        {
            sb.append(solve(n/100)).append(" Hundred ").append(solve(n%100));
        }
        else if(n<1000000)
        {
            sb.append(solve(n/1000)).append(" Thousand ").append(solve(n%1000));
        }
        else if(n<1000000000)
        {
            sb.append(solve(n/1000000)).append(" Million ").append(solve(n%1000000));
        }
        else
        {
            sb.append(solve(n/1000000000)).append(" Billion ").append(solve(n%1000000000));
        }
        return sb.toString().trim();
    }
}