public class Series {
    public static void main(String[] args)  {
        int[] h={1,5,4,3};
        int l=0,r=h.length-1;
        int water=0;
        while(l<r){
            int ar=(r-l)*Math.min(h[l],h[r]);
            water=Math.max(water, ar);
            if(h[l]<h[r])
                l++;
            else
                r--;
        }
        System.out.print(water);


    }

}
