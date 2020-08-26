/* 
Problem - 3 Difficulty - Easy
Link to problem - First Repeating Element
https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1/?track=SPC-Hashing&batchId=135

Given an array arr[] of size N. The task is to find the first repeating
element in an array of integers, i.e., an element that occurs more than
once and whose index of first occurrence is smallest.

My solution to problem - 
*/

public static int firstRepeated(int []arr, int n) 
{
    //Your code here
    int first_Rep_Index=n;
    boolean flag=true;
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    int c;
    for(int i=0;i<n;i++){
        if(hm.containsKey(arr[i])){
            c=hm.get(arr[i]);
            if(c<first_Rep_Index){
            first_Rep_Index=c;
            }
            flag=false;
        }
        else
            hm.put(arr[i],i);
    }
    if(flag)
    return -1;
    else
    return first_Rep_Index+1;
}

/* 
Problem - 4 Difficulty - Easy
Link to problem - Intersection of two arrays
https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1/?track=SPC-Hashing&batchId=135

Given two arrays A and B respectively of size N and M, the task is to print the count of elements 
in the intersection (or common elements) of the two arrays.

For this question, the intersection of two arrays can be defined as the set
containing distinct common elements between the two arrays

My solution to problem - 

Why is !counted.contains(b[i] added?
{1,2,3}
{2,2,2}

Try the count of this without it.
*/

public static int NumberofElementsInIntersection (int a[], int b[] , int n, int m)
{
    int count=0;
    HashSet<Integer> hs = new HashSet<Integer>();
    HashSet<Integer> counted = new HashSet<Integer>();
    for(int i=0;i<n;i++){
        hs.add(a[i]);
    }
    for(int i=0;i<m;i++){
        if(hs.contains(b[i]) && !counted.contains(b[i])){
        count++;
        counted.add(b[i]);
        }
    }
    return count;
}

/* 
Problem - 5 Difficulty - Easy
Link to problem - Union of two arrays
https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1/?track=SPC-Hashing&batchId=135

Given two arrays A and B of size N and M respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
If there are repetitions, then only one occurrence of element should be printed in union

My solution to problem - 
*/
public static int doUnion(int a[], int n, int b[], int m) 
{
    //Your code here
    HashSet<Integer> hs=new HashSet<Integer>();
    for(int i=0;i<n;i++){
        hs.add(a[i]);
    }
    for(int i=0;i<m;i++){
        hs.add(b[i]);
    }
    return hs.size();
}

/* 
Problem - 6 Difficulty - Easy
Link to problem - Hashing for pair - 1
https://practice.geeksforgeeks.org/problems/hashing-for-pair-1/1/?track=SPC-Hashing&batchId=135

You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array.

My solution to problem - 
*/
public static int sumExists(int arr[], int N, int sum)
    {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            hm.put(arr[i],i);
            arr[i]=sum-arr[i];
        }
        for(int i=0;i<N;i++){
           if(hm.containsKey(arr[i])){
                if(hm.get(arr[i])!=i)
                    return 1;
           }
        }
        return 0;
    }
/* Approach for the problem. Put the array with the index in a hashmap and at the same time subtract the
sum from the array so
[8,5,2] sum = 7
becomes
[1,2,5]

and if in the new array there's any element which is in the hashmap but not at the same index then yes,
the pair exists.

Why are we storing the index?
[8,5,2] sum = 16
becomes
[8,11,14]

and if we don't compare indexes it'll return false
*/
