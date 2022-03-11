public class EvenArray
{
    int[] arr={3,2,8,1,4,7};
        public int countEven()
        {
            int count=0;
            for(int i=0;i< arr.length;i++){
                if(arr[i] % 2==0)
                {

                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        EvenArray ea=new EvenArray();
        System.out.println(ea.countEven());
        System.out.println("hi");
    }
}
