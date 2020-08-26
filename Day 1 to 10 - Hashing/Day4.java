/* 
Problem - 9 Difficulty - Easy

Link to problem - Winner of an election
https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1/?track=SPC-Hashing&batchId=135

Given an array of names (consisting of lowercase characters) of candidates in an election. A candidate name in array represents 
a vote casted to the candidate. Print the name of candidate that received Max votes. 

If there is tie, print lexicographically smaller name.

My solution to problem - 
*/

class Sol
{
    public static pair winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> hm=new HashMap<>();
        int c;
        for(int i=0;i<n;i++){
            c=hm.getOrDefault(arr[i],0);
            if(c==0)
            hm.put(arr[i],1);
            else
            hm.put(arr[i],c+1);
        }
        c=0;
        String name="";
        for(Map.Entry<String,Integer> entry: hm.entrySet()){
            if(entry.getValue()>c){
                c=entry.getValue();
                name=entry.getKey();
            }
            if(entry.getValue()==c){
                int cmp=name.compareTo(entry.getKey());
                if(cmp>0){
                    name=entry.getKey();
                }
            }
        }
        return new pair(name,c);
    }
}

/* 
Problem - 10 Difficulty - Easy

Link to problem - Subarray with 0 sum
https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1/?track=SPC-Hashing&batchId=135

Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

My solution to problem - 
*/

static boolean findsum(int arr[],int n)
{
    //HashSet<Integer> hs=new Hashset<>();
    HashSet<Integer> hs = new HashSet<>();
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
        if(arr[i]==0 || hs.contains(sum) || sum==0)
        return true;
        hs.add(sum);
        
    }
    return false;
}

/* Why
arr[i]==0
because if some array just has element 0 it's automatically has that array

Why sum==0
for the condition {10,-10}*/