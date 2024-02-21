package com.yomahub.liteflow.test.rollback.cmp;

import com.yomahub.liteflow.core.NodeBooleanComponent;

public class XCmp extends NodeBooleanComponent {
    @Override
    public boolean processBoolean() throws Exception {
        System.out.println("XCmp executed!");
        return true;
    }

    @Override
    public void rollback() throws Exception {
        System.out.println("XCmp rollback!");
    }
}
