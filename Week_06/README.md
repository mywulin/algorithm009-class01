# 分治 + 回溯 + 递归 + 动态规划
## 递归代码模版

```bash
public void recur(int level, int param) {
     // terminator
     if (level > MAX_LEVEL) {
     // process result
     return;
     }
     // process current logic
     process(level, param);
     // drill down
     recur( level: level + 1, newParam);
     // restore current status

}
```

## 分治代码模板

```bash
def divide_conquer(problem, param1, param2, ...):
    # recursion terminator
    if problem is None:
         print_result
         return
    # prepare data
     data = prepare_data(problem)
     subproblems = split_problem(problem, data)
    # conquer subproblems
     subresult1 = self.divide_conquer(subproblems[0], p1, ...)
     subresult2 = self.divide_conquer(subproblems[1], p1, ...)
     subresult3 = self.divide_conquer(subproblems[2], p1, ...)
    …
    # process and generate the final result
     result = process_result(subresult1, subresult2, subresult3, …)

     # revert the current level states 
```
     
## 小结
* 人肉递归低效、很累
* 找到最近最简方法，将其拆解成可重复解决的问题
* 数学归纳法思维（抵制人肉递归的诱惑）
* 本质：寻找重复性 —> 计算机指令集
