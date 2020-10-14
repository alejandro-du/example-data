package org.vaadin.artur.exampledata;

import java.util.Random;

public class ChanceStringType extends DataType<String> {

    private String type;

    public ChanceStringType(String type) {
        this.type = type;
    }

    @Override
    public String getValue(Random random, int seed) {
        return ChanceInterface.getString(seed, this.type);
    }

}