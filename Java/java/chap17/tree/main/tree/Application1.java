package com.ohgiraffers.chap05.section01.tree;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.StringTokenizer;


public class Application1 {

    static int N;

    static int[] parent;
    static boolean[] isVisit;
    static StringTokenizer st;

    static List<Integer>[] list;

    static StringBuilder sb = new StringBuilder();

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        sb.delete(0,sb.length());

        N = Integer.valueOf(br.readLine());

        /* 설명. node의 번호와 인덱스의 번호를 일치 시키기 위해서 입력받은 노드 크기 + 1 */
        isVisit = new boolean[N + 1];
        list = new ArrayList[N + 1];
        parent = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i <N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());

            /* 설명. 트리는 양방향이기 때문이다. */
            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);

        for (int i = 2; i < parent.length; i++) {
            sb.append(parent[i]);
            sb.append(" ");
        }

        return sb.toString();
    }

    private static void dfs(int parentNode) {

        /* 설명. 이미 방문한 노드들은 부모 노드들이고 부모 노드들을 재방문 하지 않도록 함(방문 배열의 의미) */
        isVisit[parentNode] = true;

        /* 설명. 입력받은 값을 통해 생성된 list로부터 관련 있는 노드들을 확인하기 위한 반복문 */
        for (int node : list[parentNode]) {

            /* 설명. 방문한 적이 없다면 */
            if(!isVisit[node]){
                parent[node] = parentNode;      // 이 줄부터는 사실상 node가 childNode를 의미
                dfs(node);
            }
        }
    }
}
