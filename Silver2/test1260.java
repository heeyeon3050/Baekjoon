package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class test1260 {
	static boolean visit[];
	static int N, M, V;
	static int node[][];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		node = new int[N+1][N+1];
		visit = new boolean[N+1];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			node[a][b] = 1;
			node[b][a] = 1;
		}
		dfs(V);
		sb.append("\n");
		visit = new boolean[N+1];
		bfs(V);
		
		System.out.println(sb);
	}
	
	public static void dfs(int start) {
		visit[start] = true;
		sb.append(start + " ");
		for(int i=1; i<=N; i++) {
			if(node[start][i]==1 && !visit[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visit[start] = true;
		while(!queue.isEmpty()) {
			int x = queue.poll();
			sb.append(x+ " ");
			
			for(int i=1; i<=N; i++) {
				if(node[x][i]==1 && !visit[i]) {
					queue.offer(i);
					visit[i] = true;
				}
			}
		}
	}
}
