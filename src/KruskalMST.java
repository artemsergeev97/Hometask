/*
 * @autor Sergeev Artem
 * 11-506
 * KruskalMST
 */
import java.util.Arrays;
import java.util.Comparator;

public class KruskalMST {
    public static void main(String[] args)
    {
        int V = 4;  // вершин в графе
        int E = 5;  // рёбра в графе
        Graph graph = new Graph(V, E);

        // +ребро 0-1
        graph.edge[0] = new Edge(0,1,10);

        // +ребро 0-2
        graph.edge[1] = new Edge(0,2,6);

        // +ребро 0-3
        graph.edge[2] = new Edge(0,3,5);

        // +ребро 1-3
        graph.edge[3] = new Edge(1,3,15);

        // +ребро 2-3
        graph.edge[4] = new Edge(2,3,4);

        MST(graph,V,E);
    }

    static int Find(Parent p,int v)
    {
        if(p.par[v]==-1)
        {
            return v;
        }

        return Find(p,p.par[v]);
    }

    static void MST(Graph g,int V,int E)
    {
        Arrays.sort(g.edge, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return Integer.compare(o1.weight, o2.weight);
            }
        });

        Parent par=new Parent(V);
        int eCount=0;
        Graph gh=new Graph(V,E);
        for(int i=0;i<g.edge.length;i++)
        {
            if(eCount==V-1)
            {
                break;
            }else
            {
                if(Find(par,g.edge[i].src)!=Find(par,g.edge[i].dest))
                {
                    if(par.par[g.edge[i].src]==-1)
                    {
                        par.par[g.edge[i].src]=g.edge[i].dest;
                        gh.edge[eCount]=new Edge(g.edge[i].src,g.edge[i].dest,g.edge[i].weight);
                    }else
                    {
                        par.par[g.edge[i].dest]=g.edge[i].src;
                        gh.edge[eCount]=new Edge(g.edge[i].src,g.edge[i].dest,g.edge[i].weight);
                    }
                    eCount++;
                }
            }
        }

        for(int i=0;i<eCount;i++)
        {
            System.out.println(gh.edge[i].src + " -- " + gh.edge[i].dest + " == " + gh.edge[i].weight);
        }
    }

    public static class Parent
    {
        int[] par;

        Parent(int v)
        {
            this.par=new int[v];

            for(int i=0;i<v;i++)
            {
                this.par[i]=-1;
            }
        }
    }

    public static class Graph
    {
        int V,E;
        Edge[] edge;

        Graph(int v,int e)
        {
            this.V=v;
            this.E=e;
            this.edge=new Edge[e];
        }
    }

    public static class Edge implements Comparable<Edge>
    {
        int src;
        int dest;
        int weight;

        Edge(int src,int dest,int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }

        public int compareTo(Edge o) {

            return toString().compareTo(o.toString());
        }

    }

}
