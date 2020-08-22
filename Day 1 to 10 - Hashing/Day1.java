/* The usage of Map.entry to iterate over hashmap was important.
Getting familiar with the basic methods of HashMap was good as well */

/*
Problem - 1
Link to problem - Count Non-repeated Elements
https://practice.geeksforgeeks.org/problems/count-distinct-elements-1587115620/1/?track=SPC-Hashing&batchId=135
My solution to problem - 
*/
static long countNonRepeated(int arr[], int n)
    {
        // add your code
        HashMap<Integer,Integer> hm = new HashMap<>();
        int c;
        for(int i=0;i<n;i++){
            c=hm.getOrDefault(arr[i],0);
            if(c==0)
            hm.put(arr[i],1);
            else
            hm.put(arr[i],c+1);
        }
        c=0;
        for(Integer i : hm.values()){
            if(i==1)
            c+=1;
        }
        return c;
}

/*
Problem - 2

Link to problem - Print Non-Repeated Elements in order
https://practice.geeksforgeeks.org/problems/print-distinct-elements-1587115620/1/?track=SPC-Hashing&batchId=135

My solution to problem - 
*/

static ArrayList<Integer> printNonRepeated(int arr[], int n)
{
        ArrayList<Integer> a=new ArrayList<Integer>();
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
        int c;
        for(int i=0;i<n;i++){
            c=hm.getOrDefault(arr[i],0);
            if(c==0)
            hm.put(arr[i],1);
            else
            hm.put(arr[i],c+1);
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()==1)
            a.add(entry.getKey());
        }
        return a;
}
