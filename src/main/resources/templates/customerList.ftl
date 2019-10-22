<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Customers List</title>
    <link rel="stylesheet"
          Type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div class="container-fluid" style="padding-left: 100px; padding-right: 100px " >
    <h3>Customers List</h3>
    <form name="Customers List" action="/CarRentals/customer/list">
    <br>
    <div>

        <table class="table table-sm table-striped table-bordered table-dark">
            <tr class="bg-success">
                <th>First Name</th>
                <th>Middle Name</th>
                <th>Last Name</th>
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
                <td>${customer.person.middleName}</td>
                <td>${customer.person.lastName}</td>
                <td>${gender}</td>
                <td>${customer.address}</td>
                <td>${customer.phone}</td>
                <td>${customer.eMail}</td>
                <td>${customer.bonusPoints}</td>
                <td><a href="/CarRental/customer/delete/${customer.id}" Type="Button" class="btn btn-danger" >Delete</a></td>
                <td><a href="/CarRental/customer/update/${customer.id}" Type="Button" class="btn btn-primary" >Update</a></td>
            </tr>
        </#list>
        </table>
    </div>
    <a href="/CarRental/registration" Type="Button" class="btn btn-info">Add new customer</a>
    </form>
</div>
</body>
</html>