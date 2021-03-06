package com.liujun.datastruct.base.datastruct.array.leetcode169;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liujun
 * @version 0.0.1
 * @date 2019/07/26
 */
public class TestMajoritySolution2 {

  @Test
  public void testMajority() {
    int[] value = new int[] {3, 2, 3};

    MajoritySolution2 test = new MajoritySolution2();
    int outvalue = test.majorityElement(value);
    Assert.assertEquals(outvalue, 3);
  }

  @Test
  public void testMajorityMore() {
    int[] data = new int[] {2, 2, 1, 1, 1, 2, 2};
    MajoritySolution2 majorityInstance = new MajoritySolution2();
    int majorityOut = majorityInstance.majorityElement(data);
    Assert.assertEquals(majorityOut, 2);
  }
}
