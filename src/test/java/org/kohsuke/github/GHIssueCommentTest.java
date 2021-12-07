package org.kohsuke.github;

import org.apache.commons.lang.reflect.FieldUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class GHIssueCommentTest {
    // NOTE: Don't think tests are necessary for basic getters/setters, so I have these templates for purposes of the progress report
    
    // @Test
    // public void testGHIssueCommentGetFrom() throws Exception {
    //     GHFrom from = new GHFrom();

    //     FieldUtils.writeField(from, "from", "Text here!", true);

    //     assertEquals(from.getFrom(), "Text here!");
    // }

    // @Test
    // public void testGHIssueCommentGetBody() throws Exception {
    //     GHIssueComment ic = new GHIssueComment();

    //     GHFrom from = new GHFrom();

    //     FieldUtils.writeField(from, "from", "Text here!", true);
    //     FieldUtils.writeField(ic, "body", from, true);

    //     assertEquals(ic.getBody(), from);
    // }


}
