/* 
Problem - 7 Difficulty - Easy

Link to problem - Check if two arrays are equal or not
https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1/?track=SPC-Hashing&batchId=135

Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if
both of them contain same set of elements, arrangements (or permutation) of elements may be different though.

Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

My solution to problem - 
*/

public static boolean check(long arr[],long brr[],int n)
{
    //Your code here
    HashMap<Long,Long> hm=new HashMap<>();
    long c;
    long x=0;
    for(int i=0;i<n;i++){
        c=hm.getOrDefault(arr[i],x);
        if(c!=0)
            hm.put(arr[i],c+1);
        else
        hm.put(arr[i],Long.valueOf(1));
    }
    
    for(int i=0;i<n;i++){
        c=hm.getOrDefault(brr[i],x);
        if(c==0){
            return false;
        }
        else{
            hm.put(brr[i],c-1);
        }
    }
    for(Map.Entry<Long,Long> entry: hm.entrySet()){
        if(entry.getValue()!=0){
            return false;
        }
    }
    return true;
}

/* 
Problem - 8 Difficulty - Easy

Link to problem - Numbers containing 1, 2 and 3
https://practice.geeksforgeeks.org/problems/numbers-containing-1-2-and-32555/1/?track=SPC-Hashing&batchId=135

Given an array arr[] of N numbers. The task is to print only those numbers whose digits are from set {1,2,3}.

My solution to problem - 
*/

public static void findAll()
{
    //Your code here
    int num=1,num2;
    ArrayList<Integer> a=new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    mp.put(1,1);
    mp.put(2,1);
    mp.put(3,1);
    
    int j=0;
    
    while(num<=1000000)
    {
    num2=a.get(j++);
    
    if((num2*10)+1<=1000000){
        a.add((num2*10)+1);
        mp.put(num2*10+1,1);
    }
    
    if((num2*10)+2<=1000000){
        a.add((num2*10)+2);
        mp.put(num2*10+2,1);
    }
    
    if((num2*10)+3<=1000000){
        a.add((num2*10)+3);
        mp.put((num2*10)+3,1);
    }
    num=(num2*10)+3;
    }
}
