class Solution {
    public String numberToWords(int num) {
        String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
            "Eleven", "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
        };
        String tens[]={"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        
        if(num==0)
            return "Zero";
        if(num<20)
            return ones[num];
        if(num<100)
        {
            int r=num%10;
            int q=num/10;
            if(r==0)
                return tens[q-2];
            return tens[q-2]+" "+ones[r];
        }
        if(num<1000)
        {
            int r=num%100;
            int q=num/100;
            if(r==0)
                return ones[q]+ " Hundred";
            return ones[q]+ " Hundred "+numberToWords(r);
        }
        if(num<1_000_000)
        {
            int r=num%1000;
            int q=num/1000;
            if(r==0)
                return numberToWords(q)+ " Thousand";
            return numberToWords(q)+ " Thousand "+numberToWords(r);
        }
        if(num<1_000_000_000)
        {
            int r=num%1_000_000;
            int q=num/1_000_000;
            if(r==0)
                return numberToWords(q)+ " Million";
            return numberToWords(q)+ " Million "+numberToWords(r);
        }
        int q = num / 1_000_000_000;
        int r = num % 1_000_000_000;

        if (r == 0) {
            return numberToWords(q) + " Billion";
        }

        return numberToWords(q) + " Billion " + numberToWords(r);
    }
}