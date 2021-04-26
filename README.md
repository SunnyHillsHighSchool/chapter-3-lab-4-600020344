[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=4665168&assignment_repo_type=AssignmentRepo)
# Chapter-3-Lab-4

**Lab Goal :** This lab was designed to teach you more about using a Priority Queue.

**Lab Description :** Read a list of Strings. Store the Strings in the PriorityQueue and display the list in priority queue order, display the min value, and display the queue in natural order.

      

**Sample Data :** 

one two three four five six seven

1 2 3 4 5 one two three four five

a p h j e f m c i d k l g n o b

**Sample Output :**

toString() - [five, four, seven, two, one, three, six]

getMin() - five

getNaturalOrder() - five four one seven six three two

toString() - [1, 3, 2, 4, 5, three, five, two, four, one]

getMin() - 1

getNaturalOrder() - 1 2 3 4 5 five four one three two

toString() - [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p]

getMin() - a

getNaturalOrder() - a b c d e f g h i j k l m n o p

          

**_BASIC PRIORITYQUEUE CODE_**

PriorityQueue<Integer> pq;

pq = new PriorityQueue<Integer>();

pq.add(67);

pq.add(34);

pq.add(12):

out.println(pq.remove()); //outs     12

out.println(pq.remove()); //outs     34

out.println(pq.remove()); //outs     67

PriorityQueue is a minimum heap with the 

smallest value at root.
