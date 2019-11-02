<#import "../common.ftl" as c/>
<@c.page title="Car List">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Car List</title>
    <link rel="stylesheet" href="/style/styleSearch.css" type="text/css">
</head>
<body>
<div class="container">
    <br>
    <h3>Car List</h3>
    <br>
    <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names..">

            <table class="table table-sm table-striped table-bordered table-dark" id="myTable">
                <tr class="bg-success">
                    <th>Brand car</th>
                    <th>Model car</th>
                    <th>Cost car</th>
                    <th>License number plates</th>
                    <th>Car year</th>
                    <th>Type</th>
                    <th>Rental price</th>
                    <th>Repair car</th>
                    <th>Rent car</th>
                </tr>
                <#list cars as car>
                    <#assign repair = "">
                    <#if car.repair == true>
                        <#assign repair = "yes">
                    <#else>
                        <#assign repair = "no">
                    </#if>
                    <#assign rent = "">
                    <#if car.rent == true>
                        <#assign rent = "yes">
                    <#else>
                        <#assign rent = "no">
                    </#if>
                    <tr>
                        <td>${car.brandCar}</td>
                        <td>${car.modelCar}</td>
                        <td>${car.costCar}</td>
                        <td>${car.licenseNumberPlates}</td>
                        <td>${car.yearCar}</td>
                        <td>${car.typeCar}</td>
                        <td>${car.rentalPrice}</td>
                        <td>${repair}</td>
                        <td>${rent}</td>
                    </tr>
                </#list>
        </table>
</div>
<script src="/javascript/js_Search.js" type="text/javascript"></script>
</body>
</html>
</@c.page>