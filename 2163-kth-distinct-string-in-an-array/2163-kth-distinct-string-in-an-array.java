class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }

            else{
                map.put(arr[i],1);
            }
        }

       
        for(String key: arr){
            if(map.get(key)==1){
                --k;
                if(k==0){
                    return key;
                }
            }
        }

        

        return "";
    }
}