package teammates.ui.controller;

import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;

public class StudentFeedbackResponseCommentDeleteAction extends FeedbackResponseCommentDeleteAction {

    @Override
    protected void verifyAccessibleForSpecificUser(FeedbackSessionAttributes fsa, FeedbackResponseAttributes response) {

    }

    @Override
    protected void setStatusToAdmin(FeedbackResponseCommentAttributes feedbackResponseComment) {
        statusToAdmin += "StudentFeedbackResponseCommentDeleteAction:<br>"
                + "Deleting feedback response comment: " + feedbackResponseComment.getId() + "<br>"
                + "in course/feedback session: " + courseId + "/" + feedbackSessionName + "<br>";
    }
}
