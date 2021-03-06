# 极客时间算法训练营-第一周小结

## 主要内容

本周主要学习了数组、链表、栈、队列、Deque、PriorityQueue

### 1、非受限线性表
#### 1.1 顺序结构 - 数组

* 在内存中需要占用连续空间
* 随机访问快，时间复杂度O(1)
* 插入与删除慢，O(N)，需要移动数据
* 适用于需要随机访问的场景。

#### 1.2 链式结构 - 链表

* 单链表
    - 不支持随机访问
    - 插入与删除快，O(1)
    - 需额外的空间存储next指针
* 双链表：prev、next
* 循环链表：tail -> head

### 2、受限线性表
#### 2.1 栈
* 可用数组、链表实现，只能从一端插入、一端删除，先进后出
* 增加与删除时间复杂度为O(1)，查询为O(N)
* 适用于最近相关性问题，如浏览器前进后退、括号匹配、表达式计算

#### 2.2 队列
* 普通队列可用数组、链表实现，先进先出
* 增加与删除时间复杂度为O(1)，查询为O(N)
* 常用的2种队列：
    - 双端队列Deque：两端均可入队、出队
    - 优先队列PriorityQueue
* 适用于LRUCache

### 3、做题思路和反思

* 对遇到懵逼题目的思考方式有了一定收获，常用到暴力法和找重复性，如爬楼梯这类题目，因为计算机是人设计的，它主要擅长解决重复性的题目，所以遇到题目看看能否拆解成子问题来解决。
* 另外，我平时做题太慢，一道题目往往就是题意理解不到位，要么就是自己思考一个多小时，即使最后做出来，也是用的非常复杂的方法。这时，覃超老师介绍的五毒神掌对我就很有用，5-10分钟理解题意，不太明白的时候，就赶紧去看官方题的解析或者看讨论部分别人的题解，深入理解别人的解法，然后比较几种votes rate比较高的题解后，自己重新把它写出来。
* 我自己做题的时候，往往都是想到一种解法，如果不是暴力法，我就直接写了，很难想到2种以上的方法，估计还是自己做题太少，学到的解题思路太少的原因吧，要继续刷题、持续积累
* 另外，五毒神掌里第3步，我基本没有践行过，过了一天或几天后，我很快就忘记了，再过了一个月去做，脑子里只有一点点思路，但是对于链表这类思路简单、对代码编写能力要求比较高的题目来说，我就太生疏了
* 对于995的上班族来说，把一周的课程都放在周末来学了，本以为2小时可以搞定，发现简直太难了，进度太慢，我想把老师给出的几种解题思路都做一遍，结果一上午也就完成了2-3道题，所以就更没时间温故之前的题目了


### 4、源码方面：

老师布置的阅读源码作业，我还没来得及去分析，在作业提交后，我抽空再看吧 :)