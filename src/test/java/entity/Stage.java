/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package entity;

import lombok.Data;

import java.util.List;

/**
 * Author: Tory
 * Date: 4/18/18
 * Time: 9:22 PM
 */

@Data
public class Stage{
    private Integer number;
    private Integer stageNumber;
    private List<Integer> childNumber;


    public static final class StageBuilder {
        private Integer number;
        private Integer stageNumber;
        private List<Integer> childNumber;

        private StageBuilder() {
        }

        public static StageBuilder aStage() {
            return new StageBuilder();
        }

        public StageBuilder withNumber(Integer number) {
            this.number = number;
            return this;
        }

        public StageBuilder withStageNumber(Integer stageNumber) {
            this.stageNumber = stageNumber;
            return this;
        }

        public StageBuilder withChildNumber(List<Integer> childNumber) {
            this.childNumber = childNumber;
            return this;
        }

        public Stage build() {
            Stage stage = new Stage();
            stage.setNumber(number);
            stage.setStageNumber(stageNumber);
            stage.setChildNumber(childNumber);
            return stage;
        }
    }
}
