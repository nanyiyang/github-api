package org.kohsuke.github;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * Wrapper to define changed fields on issues action="edited"
 *
 * @see GHEventPayload.Issue
 */
@SuppressFBWarnings("UWF_UNWRITTEN_FIELD")
public class GHIssueCommentChanges {

    private GHFrom body;

    /**
     * Old issue comment body.
     *
     * @return old issue body (or null if not changed)
     */
    public GHFrom getBody() {
        return body;
    }

    /**
     * Wrapper for changed values.
     */
    public static class GHFrom {
        private String from;

        /**
         * Previous value that was changed.
         *
         * @return previous value
         */
        public String getFrom() {
            return from;
        }
    }
    
}
