/**
Insomniac Raccoons | Faiza Huda, Tasnim Chowdhury, Diana Akhmedova
APCS pd8
HW103 -- Erica's Friends, Hugo, and The One in the Middle
2022-05-19th
time spent: 1 hrs

DISCO:
* HeapMin and HeapMax are almost identical.
* We don't know if we needed RunMed.java or RunMed.algo, so we have both.

QCC:
* Why are we sorting heap instead of using naive method of QuickSort even though they
both have O(log(n))?

ALGO:
use minheap/maxheap combo
1. if next val < root of maxheap, add to maxheap
  else add to minheap
2. balance heaps (so that size difference < 2) (remove from larger heap, add to smaller heap)
  at any time find med by:
    a) heap sizes equal: med is mean of roots
    b) heap sizes !equal: med is root of larger heap
**/

import java.util.*;
import java.io.*;

public class RunMed {

  ALHeapMax lilVals;
  ALHeapMin bigVals;

  public RunMed() {
    lilVals = new ALHeapMax();
    bigVals = new ALHeapMin();
  }

  public int getMedian() throws NoSuchElementException {
    if ( lilVals.size() == bigVals.size() ) {
      return ((lilVals.peekMax() + bigVals.peekMin()) / 2);
    } else {
      if (lilVals.size() > bigVals.size() ) {
        return lilVals.peekMax();
      } else {
        return bigVals.peekMin();
      }
    }
  }

  public void add(Integer newVal) {
    if (newVal < lilVals.peekMax()) {
      lilVals.add(newVal);
    } else {
      bigVals.add(newVal);
    }
    if ((Math.abs(lilVals.size()) > 2) || (Math.abs(bigVals.size()) > 2)) {
      if (lilVals.size() > bigVals.size() ) {
        Integer r = lilVals.removeMax();
        bigVals.add(r);
      } else {
        Integer f = bigVals.removeMin();
        lilVals.add(f);
      }
    }
  }
  
} //class
