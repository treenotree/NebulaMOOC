/*
 * @author Zhanghh
 * @date 2019-05-14
 */
package com.nebula.mooc.webserver.dao;

import com.nebula.mooc.core.entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao {

    List<Course> getCourseList(CoursePage page);

    Course getCourse(CoursePage page);

    List<CourseChapter> getCourseChapterList(CoursePage page);

    List<CourseComment> getCourseCommentList(CoursePage page);

    List<CourseSection> getCourseSectionList(CoursePage page);

    List<CourseSectionComment> getCourseSectionCommentList(CoursePage page);

    List<CourseSectionCommentReply> getCourseSectionCommentReplyList(CoursePage page);

}
