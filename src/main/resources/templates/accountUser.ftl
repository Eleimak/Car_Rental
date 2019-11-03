<#import "common.ftl" as c/>
<@c.page title="User Account">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>User Account</title>
</head>
<body>
<div class="container">
    <fieldset>
        <br>
            <legend>${customer.person.firstName} ${customer.person.lastName}</legend>
        <table class="table table-bordered table-dark" class="rounded float-left">
                <#assign gender = "">
                <#if customer.person.gender == true>
                    <#assign gender = "man">
                <#else>
                    <#assign gender = "woman">
                </#if>
            <div class="container" >
                <tr>
                    <th>First Name</th>
                    <td>${customer.person.firstName}</td>
                </tr>
                <tr>
                    <th>Last Name</th>
                    <td>${customer.person.lastName}</td>
                </tr>
                <tr>
                    <th>Middle Name</th>
                    <td>${customer.person.middleName}</td>
                </tr>
                <tr>
                    <th>Gander</th>
                    <td>${gender}</td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td>${customer.address}</td>
                </tr>
                <tr>
                    <th>Mobile phone</th>
                    <td>${customer.phone}</td>
                </tr>
                <tr>
                    <th>@e-mail</th>
                    <td>${customer.eMail}</td>
                </tr>
                <tr>
                    <th>Bonus points</th>
                    <td>${customer.bonusPoints}</td>
                </tr>
            </div>
        </table>
    </fieldset>
</div>
</body>
</html>
</@c.page>