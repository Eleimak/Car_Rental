
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>User Account</title>
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet"type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div class="container-fluid" style="padding-left: 500px; padding-right: 500px " >
    <fieldset>
        <legend>User Account</legend>
        <table class="table table-bordered table-hover" class="rounded float-left">
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
                        <th>Middle Name</th>
                        <td>${customer.person.middleName}</td>
                </tr>
                <tr>
                        <th>Last Name</th>
                        <td>${customer.person.lastName}</td>
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