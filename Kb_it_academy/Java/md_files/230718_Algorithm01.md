# Java 문법

## remove(int) vs remove(Integer)

```java
		ArrayList<Integer>[] arr = new ArrayList[3];
		ArrayList<Integer>[] arr2 = new ArrayList[3];

		for(int i=0; i<3; i++) {
			arr[i] = new ArrayList<>();
			arr2[i] = new ArrayList<>();
		}
		arr[0].add(2);
		arr[0].add(10);
		arr[0].add(9);
		
		arr[0].remove(2);//2번째 값 삭제 
		System.out.println(arr[0]);//[2, 10]
		
		arr2[0].add(2);
		arr2[0].add(10);
		arr2[0].add(9);
		
		arr2[0].remove(arr2[0].indexOf(2));//값이 2인 것 삭제 
		System.out.println(arr2[0]);//[10, 9]
```



## 이진트리

ArrayList보다 그냥 배열로 만드는게 더 좋다.

ex) 백준 1991 - 트리 순회





## 트리 순회

dfs(now)

    (1) 여기 출력 시, 전위 순회

    dfs(arr[now][0])

    (2) 여기 출력 시, 중위 순회

    dfs(arr[now][1])

    (3) 여기 출력 시, 후위 순회

ex) 백준 1991 - 트리 순회 




