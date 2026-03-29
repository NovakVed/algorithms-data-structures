def dfs_iterative(graph, start):
    visited = set()
    stack = [start]  # Initialize stack with the starting node

    while stack:
        node = stack.pop()  # Pop the top node from the stack
        if node not in visited:
            print(node)  # Process the node (e.g., print)
            visited.add(node)
            # Push unvisited neighbors onto the stack in reverse order
            # This ensures left-to-right traversal (like recursive DFS)
            for neighbor in reversed(graph[node]):
                if neighbor not in visited:
                    stack.append(neighbor)

# Example usage:
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}

print('DFS (Iterative)')
dfs_iterative(graph, 'A')
