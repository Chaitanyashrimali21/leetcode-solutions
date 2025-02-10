class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
         ArrayList<Boolean> list =  new ArrayList();
        for(int i = 0;i< candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
         
         for(int i =0;i<candies.length;i++){
            int sum = extraCandies + candies[i];

            if(sum >= max){
                list.add(true);
            }else{
                list.add(false);
            }
         }

        return list;

    }
}