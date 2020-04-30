Stream :

Why
1) With less lines of code get more functionality.
2) Multi threaded approach is large data set.
3) We can use

Source --> Intermediate operations --> terminal operations

Source -->  Set/List
Intermediate --> Filter/Sort/Map
				Filter first before sort or map 
				This will improve the performnce
				We can also use parallelstream
				
				anyMatch     flatmap
				distinct    map
				filter      skip
				findFirst   sorted
				
				
			
Terminal --> Collect (Void or non stream result)

forEach  is applied to each element

	Reduce
		count    min
		max 	reduce
				summaryStatistics









