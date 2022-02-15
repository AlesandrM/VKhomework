package ru.netology.manager;

import ry.netology.domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] getPosts() {
        return null;
    }


    public class commentsInfo {
        private int count;
        private int canPost;
        private int groupsCanPost;
    }

    public class likesInfo {
        private int count;
        private int userLikes;
        private int canLike;
    }

    public class repostInfo {
        private int count;
        private int userReposted;
    }

}
