package hdu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/10/1.
 */
public class JungleRoad {

    public class road {
        public int from, to, w;

        public road(int from, int to, int w) {
            this.from = from;
            this.w = w;
            this.to = to;
        }
    }

    private static int[] set = new int[26];

    public static void main(String[] args) {
        int num, all = 0;//all  road的长度
        /*ArrayList<Integer>[] link=new ArrayList[26];
        for(int i=0;i<26;i++){
            link[i]=new ArrayList<>();
        }*/
        Scanner in = new Scanner(System.in);
        JungleRoad outer = new JungleRoad();
        road[] roads = new road[26 * 27 / 2];
        while (in.hasNext()) {
            num = in.nextInt();
            for (int i = 0; i < 26; i++)
                set[i] = i;
            while (num != 1) {
                int from, roadNum;
                String c = in.next();
                from = c.charAt(0) - 'A';
                roadNum = in.nextInt();
                while (roadNum != 0) {
                    c = in.next();
                    int to = c.charAt(0) - 'A', w = in.nextInt();
                    roads[all++] = outer.new road(from, to, w);
                    roadNum--;
                }
                num--;
            }

            Arrays.sort(roads, 0, all, new Comparator<road>() {
                @Override
                public int compare(road o1, road o2) {
                    return o1.w < o2.w ? 1 : o1.w == o2.w ? 0 : -1;
                }
            });

            int res = 0;

            for (int i = 0; i < all; i++) {
                if (merge(roads[i].from, roads[i].to)) {
                    res += roads[i].w;
                }
            }
            System.out.println(res);
        }
    }

    private static int find(int x) {
        int f = x;
        while (set[f] != x)
            f = x;
        return f;
    }

    private static boolean merge(int x, int y) {
        int fx = find(x), fy = find(y);
        if (fx != fy) {
            set[fx] = fy;
            return false;
        }
        return true;
    }

}
