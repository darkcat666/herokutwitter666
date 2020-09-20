<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="test_twitter4.tweet_test444" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テスト</title>
</head>
<body>
<% tweet_test444 test444 = new tweet_test444(); %>
<input type="button" value="ツイートボタン" onclick="test444.TweetTest444();" />
</body>
</html>