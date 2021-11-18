package org.kohsuke.github;

import org.apache.commons.lang.reflect.FieldUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import javax.security.auth.Subject;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class GHThreadTest {
    static class Subject {
        String title;
        String url;
        String latest_comment_url;
        String type;
    }

    @Test
    public void testGetIssueNumber() {
        try {
            Method method = GHThread.class.getDeclaredMethod("getIssueNumber", (Class<?>[]) null);
            Constructor<GHThread> constructor = GHThread.class.getDeclaredConstructor();
            constructor.setAccessible(true);

            

            GHThread thread = constructor.newInstance();
            Subject dummySubject = new Subject();
            dummySubject.url = "asdf";

            Field subject = GHThread.class.getDeclaredField("subject");
            subject.setAccessible(true);

            

            FieldUtils.writeField(thread, subject, dummySubject, true);

            // Field t = thread.getClass().getDeclaredField("subject");
            // t.setAccessible(true);
            // t.set(subject, dummySubject);

            // Field s = t.getType().getDeclaredField("url");
            // s.setAccessible(true);
            // s.set(url, "https://github.com/hub4j/github-api/issues/347");


            // Field subj = subject.getClass().getDeclaredField("url");
            // subj.setAccessible(true);
            // s.set(url, "https://github.com/hub4j/github-api/issues/347");

            // Subject.url = "asdfadsf";
            // subject.url = "https://github.com/hub4j/github-api/issues/347";
            // thread.subject = subject;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
