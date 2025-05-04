#include <iostream>
#include <vector>
#include <stack>
#include <queue>
#include <omp.h>
using namespace std;

class Graph{

    vector<vector<int>> adj;
    vector <bool> visited;

    public:
        Graph(int n): adj(n),visited(n,false){};

        void add_edge(int u , int v){
            adj[u].push_back(v);
            adj[v].push_back(u);
        }

        void reset_visited(){
            fill(visited.begin(), visited.end(), false );
        }

        void dfs(int src){
            stack<int> s;
            s.push(src);
            

            while (!s.empty())
            {
                int node = s.top(); s.pop();
                if(!visited[node]){
                    visited[node] = true;
                    cout<< node<<" ";
                }
                #pragma omp parallel for
                for(int i = adj[node].size()-1;i>=0;--i){
                    int nigh = adj[node][i];

                    #pragma omp critical
                    if (!visited[nigh])
                    {
                        s.push(nigh);
                    }
                }
            } 
        }


        void bfs(int src){
            queue<int> s;
            s.push(src);
            visited[src] = true;

            while (!s.empty())
            {
                int node = s.front(); s.pop();
                cout<< node<<" ";
    
                #pragma omp parallel for
                for(int i = 0;i<adj[node].size();++i){
                    int nigh = adj[node][i];

                    #pragma omp critical
                    if (!visited[nigh])
                    {
                        visited[nigh]=true;
                        s.push(nigh);
                    }
                }
            } 
        }
};


int main(){
    Graph g(6);
    g.add_edge(0, 1);
    g.add_edge(0, 2);
    g.add_edge(1, 3);
    g.add_edge(1, 4);
    g.add_edge(2, 4);
    g.add_edge(3, 4);
    g.add_edge(3, 5);
    g.dfs(0);
    g.reset_visited();
    cout<<"\n***************\n";
    g.bfs(0);
}