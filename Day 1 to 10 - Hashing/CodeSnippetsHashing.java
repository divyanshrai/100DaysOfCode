ArrayList<Integer> a=new ArrayList<Integer>();

// Creating a Hashmap
LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();

// Putting in Hashmap
hm.put(1,2);

// NOTE! ^This is differnet for hashset
hs.add(1);

//get value in hashmap for particular key
hm.getValue(1);

/* Instead of checking if a particular key exist
use getOrDefault. If c==0, simple add c, if c!=0 increment count and put it back*/
c=hm.getOrDefault(arr[i],0);

//To iterate through just values
for(Integer i : hm.values()){
}
//To iterate through just Keys
for(Integer i : hm.keySet()){
}

// Iterating through a hashmap using Map.Entry and getting valuenad keys using getValue and getKey
for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
    if(entry.getValue()==1)
    a.add(entry.getKey());
}

// To check if hm contains a particular key or value
hm.containsKey(a[i])
hm.containsValue(a[i])

// NOTE! ^This is differnet for hashset
HashSet<Integer> hs = new HashSet<Integer>();
hs.contains(a[i])