学习笔记
###递归 Recursion
```java
class Recur{
    public void recur(int level, int param) { 
      // terminator  终止条件
      if (level > MAX_LEVEL) { 
        // process result 
        return; 
      }
      // process current logic   处理当前层逻辑
      process(level, param); 
      // drill down  进到下一层
      recur( level: level + 1, newParam); 
      // restore current status 清理当前层
    }
}


```

###分治
 找重复性。分解子问题  
 代码模板： 
 ```java
class DivideConquer{
    private static int divide_conquer(Problem problem ) {
      
      if (problem == NULL) {
        int res = process_last_result();
        return res;     
      }
      subProblems = split_problem(problem);
      
      res0 = divide_conquer(subProblems[0]);
      res1 = divide_conquer(subProblems[1]);
      
      result = process_result(res0, res1);
      
      return result;
    }
}
```

###回溯
试错分步解决问题
