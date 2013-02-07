package hello.sum;

import java.util.ArrayList;
import java.util.List;

public class SumList {
  List<Integer> aList = new ArrayList<Integer>();
  public SumList(List<Integer> list) {
    aList = list;
  }
  
  public Integer compute() {
    int sum = 0;
    for(Integer element : aList) {
      sum += element;
    }
    
    return sum;
  }
}