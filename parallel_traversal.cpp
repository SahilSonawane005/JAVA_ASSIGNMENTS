#include <omp.h>
#include <iostream>
#include <vector>
#include <stack>
#include <queue>

class Graph {
public:
    Graph(int n) : adj_matrix(n, std::vector<int>(n, 0)), visited(n, false) {}

    void add_edge(int u, int v) {
        adj_matrix[u][v] = 1;
        adj_matrix[v][u] = 1;  // undirected graph
    }

    void reset_visited() {
        std::fill(visited.begin(), visited.end(), false);
    }

    void parallel_dfs(int src) {
        std::stack<int> s;
        s.push(src);

        while (!s.empty()) {
            int node = s.top(); s.pop();
            if (!visited[node]) {
                visited[node] = true;
                std::cout << node << " ";

                #pragma omp parallel for
                for (int i = adj_matrix.size() - 1; i >= 0; --i) {
                    if (adj_matrix[node][i]) {
                        #pragma omp critical
                        {
                            if (!visited[i]) s.push(i);
                        }
                    }
                }
            }
        }
    }

    void parallel_bfs(int src) {
        std::queue<int> q;
        visited[src] = true;
        q.push(src);

        while (!q.empty()) {
            int node = q.front(); q.pop();
            std::cout << node << " ";

            #pragma omp parallel for
            for (int i = 0; i < adj_matrix.size(); ++i) {
                if (adj_matrix[node][i]) {
                    #pragma omp critical
                    {
                        if (!visited[i]) {
                            visited[i] = true;
                            q.push(i);
                        }
                    }
                }
            }
        }
    }

private:
    std::vector<std::vector<int>> adj_matrix;
    std::vector<bool> visited;
};

int main() {
    Graph g(6);
    g.add_edge(0, 1);
    g.add_edge(0, 2);
    g.add_edge(1, 3);
    g.add_edge(2, 4);
    g.add_edge(3, 5);

    std::cout << "Parallel DFS: ";
    g.parallel_dfs(0);
    g.reset_visited();

    std::cout << "\nParallel BFS: ";
    g.parallel_bfs(0);

    std::cout << std::endl;
    return 0;
}
