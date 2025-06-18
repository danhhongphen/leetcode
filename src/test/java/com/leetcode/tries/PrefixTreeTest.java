package com.leetcode.tries;

import com.leetcode.Tries.PrefixTree;
import com.leetcode.arrays.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrefixTreeTest {

    @Test
    void prefixTreeTest1() {
        PrefixTree prefixTree = new PrefixTree();

        prefixTree.insert("dog");
        boolean searchDog = prefixTree.search("dog");
        assertThat(searchDog).isEqualTo(true);

        boolean searchDoFalse = prefixTree.search("do");// return false
        assertThat(searchDoFalse).isEqualTo(false);

        boolean startWithDo = prefixTree.startsWith("do");// return true
        assertThat(startWithDo).isEqualTo(true);

        prefixTree.insert("do");

        boolean searchDoTrue = prefixTree.search("do");
        assertThat(searchDoTrue).isEqualTo(true);

    }

}
