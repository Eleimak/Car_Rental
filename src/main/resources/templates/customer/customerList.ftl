<#import "../common.ftl" as c/>
<@c.page title="Customers List">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customers List</title>
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Customers List</h3>
    <br>
    <form name="Customers List" action="/CarRentals/customer/list">
    <div>

        <table class="table table-sm table-striped table-bordered table-dark">
            <tr class="bg-success">
                <th>First Name</th>
                <th>Last Name</th>
                <th>Middle Name</th>
                <th>Gander</th>
                <th>Address</th>
                <th>Mobile phone</th>
                <th>@e-mail</th>
                <th>Bonus points</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
            <#assign gender = "">
            <#list customers as customer>
                <#if customer.person.gender == true>
                    <#assign gender = "man">
                <#else>
                    <#assign gender = "woman">
                </#if>
            <tr>
                <td>${customer.person.firstName}</td>
                <td>${customer.person.lastName}</td>
                <td>${customer.person.middleName}</td>
                <td>${gender}</td>
                <td>${customer.address}</td>
                <td>${customer.phone}</td>
                <td>${customer.eMail}</td>
                <td>${customer.bonusPoints}</td>
                <td><a href="/CarRentals/customer/delete/${customer.id}" Type="Button" class="btn btn-danger" >Delete</a></td>
                <td><a href="/CarRentals/customer/update/${customer.id}" Type="Button" class="btn btn-primary" >Update</a></td>
            </tr>
        </#list>
        </table>
    </div>
    <a href="/CarRentals/signUp" Type="Button" class="btn btn-info">Add new customer</a>
    </form>
</div>
</body>
</html>
</@c.page>