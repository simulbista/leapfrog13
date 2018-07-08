<%-- 
    Document   : login
    Created on : Jun 30, 2018, 9:45:06 PM
    Author     : 647-np
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </head>
    <body>

        <h1><span class="label label-default" style="text-align: center">LOGIN!</span></h1>
        <c:if test = "${param.error!=null}">
            <div class="alert alert-danger" role="alert">Invalid Username/Password!!!</div>
        </c:if>
        <!--        <form method ="post" action="">
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Name</span>
                        <input type="text" name = "username" width="50px" placeholder="Your name goes here!" aria-describedby="basic-addon1"/>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1" width="25px">Password</span>
                        <input type="password" name = "password" width="50px" placeholder="Your password goes here!" aria-describedby="basic-addon1"/>
                    </div>
                    <div>
                        <button type="submit" class="btn btn-primary">login</button>
                    </div>
                </form>-->

        <form method = "post" action = "" class="form-horizontal">
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">User Name</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" name ="username" placeholder="UserName">
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">Password</label>
                <div class="col-sm-3">
                    <input type="password" class="form-control" name="password" placeholder="Password">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-2">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form>
    </body>
</html>
