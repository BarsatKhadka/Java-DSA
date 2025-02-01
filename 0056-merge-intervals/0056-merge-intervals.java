class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));

        ArrayList<int[]> result  = new ArrayList<>();
        int[] currentInterval = intervals[0];

        int currentBegin = intervals[0][0];
        int currentEnd = intervals[0][1];

        

        for(int[] i: intervals){
            if(i[0] <= currentEnd){
                currentInterval[1] = Math.max(currentEnd,i[1]);
                currentEnd = currentInterval[1];
            }
            else{
                
                result.add(currentInterval);
                currentInterval = i;
                currentBegin = currentInterval[0];
                currentEnd = currentInterval[1];
            }

        }
        result.add(currentInterval);

        return result.toArray(new int[result.size()][2]);



        
    


     
        
    }
}