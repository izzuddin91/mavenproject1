<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC -HelloWorld</title>
</head>


<body><!--spring:url value="/hello2" var="hello2url" htmlEscape="true"/-->
    <h1 style="text-align: center">${greeting}</h1>
    <h2 style="text-align: center">Score points calculator to decide whether auto or manual processing</h2>
    <c:url value="/hello2" var="hello2url"/>
    <form style="text-align: center" action="<c:out value='${hello2url}'/>">
        No of motor claims:<br>
        <input type="integer" name="no_of_motor_claims" >
        <br>
        No of windscreen claims<br>
        <input type="integer" name="no_of_windscreen_claims" >
        <br>
        WS sum insured:<br>
        <input type="text" name="ws_sum_insured" >
        <br>
        Market Price for WS parts<br>
        <input type="text" name="market_price_for_ws_parts" >
        <br>
        Type:<br>
        <input type="text" name="type" >
        <br>
        Amount submitted by workshop<br>
        <input type="text" name="no_of_windscreen_claims" >
        <br>
        date of accident<br>
        <input type="text" name="date_of_accident" >
        <br>
        date of policy effective<br>
        <input type="text" name="date_of_policy_effective" >
        <br>        
        date of policy expiry<br>
        <input type="text" name="date_of_expiry" >
        <br>     
        date of policy expiry<br>
        <input type="text" name="date_of_notification" >
        <br>  
        workshop registered state<br>
        <input type="text" name="workshop_registered_state" >
        <br>  
        policy holder registered state<br>
        <input type="text" name="policy_holder_registered_state" >
        <br> 
        accident state<br>
        <input type="text" name="accident_state" >
        <br> 
        
        <input type="submit" value="Submit"> 
        <!--<a style="text-align: center" href="<c:out value='${hello2url}'/>">Calculate score</a>-->
    </form>
</body>
</html>