from collections import deque

graph = {}
graph['you'] = ['alice', 'claire', 'bob']
graph['bob'] = ['peggy', 'anuj']
graph['alice'] = ['peggy']
graph['claire'] = ['thom', 'jonny']

def person_is_seller(name):
    return name[-1] == 'm'

visited = set()
queue = deque()
queue += graph['you']

while queue:
    person = queue.popleft()
    if person not in visited:
        if person_is_seller(person):
            print(f'Found mango salesman: {person}')
            break
        else:
            visited.add(person)
            queue += graph.get(person, [])

print("Search complete.")
