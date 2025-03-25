<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="header">
    <h1>Payment Application</h1>
    <div id="userSection">
        <div id="welcomeUser">
            Welcome, <%= session.getAttribute("username") != null ? session.getAttribute("username") : "User" %>
        </div>
        <div id="logoutButton">
            <button class="btn-primary" onclick="window.location.href='Logout'">Logout</button>
        </div>
    </div>
</div>
