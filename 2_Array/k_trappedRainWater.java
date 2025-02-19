
public class k_trappedRainWater {
    public static int TrappedRainWater(int height[]){
    //Calculate left max boundry -> in form of array
    int leftmax[]=new int[height.length];
    leftmax[0]=height[0];
    for(int i=1;i<height.length;i++){
        leftmax[i]=Math.max(height[i], leftmax[i-1]);
    }

    //calculate right max boundry -> array
    int rightmax[]=new int[height.length];
    rightmax[height.length-1]=height[height.length-1];
    for(int i=height.length-2; i>=0;i--){
        rightmax[i]=Math.max(height[i],rightmax[i+1]);
    }

    int trappedWater=0;
    //loop
    for(int i=0;i<height.length; i++){
        //waterlevel=min(leftmax bound, rightmax bound)
        int waterlevel=Math.min(leftmax[i],rightmax[i]);

        //trapped water=waterlevel - height[i]
        trappedWater += waterlevel-height[i];
    }
     return trappedWater;
}
public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};
    System.out.println(TrappedRainWater(height));
}

}
    
     
       
    

