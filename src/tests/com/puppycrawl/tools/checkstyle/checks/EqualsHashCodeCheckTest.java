package com.puppycrawl.tools.checkstyle.checks;

import com.puppycrawl.tools.checkstyle.BaseCheckTestCase;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;

public class EqualsHashCodeCheckTest
    extends BaseCheckTestCase
{
    public void testIt() throws Exception
    {
        final DefaultConfiguration checkConfig =
            createCheckConfig(EqualsHashCodeCheck.class);
        final String[] expected = {
            "126:9: Definition of 'equals()' without corresponding defnition of 'hashCode()'.",
            "163:13: Definition of 'equals()' without corresponding defnition of 'hashCode()'.",
        };
        verify(checkConfig, getPath("InputSemantic.java"), expected);
    }
}