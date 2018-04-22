package com.job;

import com.job.merkle.MerkleTrees;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MerkleTreeTest {

    // todo 怎么通过默克尔树进行零知识证明
    @Test
    public void test(){
        List<String> tempTxList = new ArrayList();
        tempTxList.add("a");
        tempTxList.add("b");
        tempTxList.add("c");
        tempTxList.add("d");
        tempTxList.add("e");

        MerkleTrees merkleTrees = new MerkleTrees(tempTxList);
        merkleTrees.merkle_tree();
        System.out.println("root : " + merkleTrees.getRoot());
    }
}
