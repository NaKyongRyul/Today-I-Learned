# Algorithm

## 그래프

____노드끼리 연결 그래프 의심____

#### 1)탐색 그래프

+ 그래프 인식

+ 2차원 배열 탐색

+ 상하좌우 움직임 구현 



#### 2)DFS vs BFS - 보편적인 경우(절대적 X)

+ 최소값: BFS

+ 백트래킹: 재귀 DFS



#### 3)쌍방향의 경우

+ isVisited[Boolean] 사용 

최대 최소값 문제는 isVisited[] 보다는 dist[][] 사용 



#### N*N 배열에 표시되어있는 그래프 문제

+ DFS: 모든 경로를 탐색 -> 최소값을 확정(시간이 오래 걸려 사용 X)

+ BFS: 처음 만나는 경로 -> 최단거리 확정(사용 O)



## 런타임 에러

+ if문 안에 &&, ||로 여러 조건이 들어갈 경우, 가장 간단한 조건부터 앞에서 넣기 

+ ex) "백준_1697_숨바꼭질" 문제에서 이것으로 런타임 에러 발생 



# 


