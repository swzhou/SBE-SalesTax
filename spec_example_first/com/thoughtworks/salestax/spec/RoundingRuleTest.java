package com.thoughtworks.salestax.spec;

import com.thoughtworks.salestax.RoundingRule;
import org.concordion.integration.junit3.ConcordionTestCase;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 3/18/12
 * Time: 9:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoundingRuleTest extends ConcordionTestCase{

    public void init(){

    }

    public BigDecimal round(BigDecimal rawPrice) {
        return RoundingRule.roundUp(rawPrice);
    }
}
