<%@ page import="java.io.IOException" %>
<%@ page import="java.sql.Connection" %><%--
  Created by IntelliJ IDEA.
  User: racha
  Date: 2020/04/05
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Create an account</title>
    <link rel="stylesheet" type="text/css" href="createAnAccount.css">

</head>

<body>

<div class="sign-up-form">

    <div class="heading-message">
        <h1>Welcome to the sign up page</h1>
    </div>

    <div class="form">
        <form name=" myForm"  method="post" action="<%= request.getContextPath()%>/createAnAccount"  >

            <ul class="list">
                <li>Name: <input type="name" name="lectName" class="input-box" placeholder="name_required"></li>
                <li>Email Address: <input type="email" name="lectEmailAd" class="input-box" placeholder="your_email"></li>
                <li>Unique Id: <input type="id" name="lectUniNo" class="input-box" placeholder="create_unique_id"></li>
                <li>Create Password: <input type="password" name="lectUniPassw" class="input-box"  placeholder="create password"></li>
                <li>Repeat Password: <input type="password" name="repeatP" class="input-box" placeholder="repeat password"></li>
                <li>
                    <button type="submit" style="height:25px; width:175px; font-weight: bold" class="submit">SUBMIT
                    </button>
                </li>
                <li><p></p></li>
                <li><p></p></li>
            </ul>
        </form>
    </div>
    <div class="terms-message">
        <p>By signing up, you agree to the terms of the service.</p>
    </div>
</div>




</body>
</html>

