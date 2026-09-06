public class sqrt {
    public static void main(String args[]){
        int x=625;
        int lo=0;
        int hi=x;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid*mid==x){
            ans=mid;
            break;
                
            }
            else if(mid*mid>x)  hi=mid-1; 
            else if(mid*mid<x) lo=mid+1;
        }
    
        System.out.println(ans);
    }
}
