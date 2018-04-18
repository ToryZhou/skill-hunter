/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.Stage;

/**
 * Author: Tory
 * Date: 4/18/18
 * Time: 9:17 PM
 */
public class StageTest extends TestCase {


    // todo for https://stackoverflow.com/questions/49900403/how-to-implement-recursive-method-properly
    public void test() {

        Stage stage1 = Stage.StageBuilder.aStage().withNumber(1).withStageNumber(0).withChildNumber(Arrays.asList(2, 3, 7)).build();
        Stage stage2 = Stage.StageBuilder.aStage().withNumber(2).withStageNumber(1).build();
        Stage stage3 = Stage.StageBuilder.aStage().withNumber(3).withStageNumber(1).withChildNumber(Arrays.asList(4, 5, 6)).build();
        Stage stage4 = Stage.StageBuilder.aStage().withNumber(4).withStageNumber(2).build();
        Stage stage5 = Stage.StageBuilder.aStage().withNumber(5).withStageNumber(2).build();
        Stage stage6 = Stage.StageBuilder.aStage().withNumber(6).withStageNumber(2).build();
        Stage stage7 = Stage.StageBuilder.aStage().withNumber(7).withStageNumber(1).build();
        List<Stage> stageList = Arrays.asList(stage1, stage2, stage3, stage4, stage5, stage6, stage7);
        List<Stage> recursive = recursive(stageList, new ArrayList<>(), stage1, 0);
        recursive.forEach(item -> System.out.println(item.getNumber()));

    }

    private List<Stage> recursive(List<Stage> stageList, List<Stage> result, Stage toAdd, int index) {
//        Boolean hasChild = false;
        if (index < stageList.size()) {
//            for (int i = 0; i < stageList.size(); i++) {
            Stage stage = stageList.get(index);
            if (toAdd.getStageNumber() <= stage.getStageNumber()) {
                toAdd = stage;
//                    hasChild = true;
            }
            recursive(stageList, result, toAdd, ++index);
            result.add(stage);
//                break;
//            }
//            if (hasChild) {
//                recursive(stageList, result, toAdd);
//            } else {
//                result.add(toAdd);
//            }
        }
        return result;
    }


}
