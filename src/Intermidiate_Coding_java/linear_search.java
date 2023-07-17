package Intermidiate_Coding_java;

class Linear_search {
    public static void Search (int[]arr,int item) {
        for( int i= 0; i<arr.length;i++)
        {
            if(arr[i]==item){
                System.out.println(item +"found at index :"+i);
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int[] arr = {10,5,15,31,-3,7};
        int item = 21;

        Search(arr,item);
        item=-3;
        Search(arr,item);
    }
}

