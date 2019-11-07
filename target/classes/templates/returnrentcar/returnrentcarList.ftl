<#import "../common.ftl" as c/>
<@c.page title="Car List">
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Return List</title>
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Return List</h3>
    <br>
    <div>
        <form name="RentCarForm" action="" method="POST">
            <table class="table table-sm table-striped table-bordered table-dark">
                <tr class="bg-success">
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Middle Name</th>
                    <th>Brand car</th>
                    <th>Model car</th>
                    <th>License number plates</th>
                    <th>Date of issue</th>
                    <th>Return date</th>
                    <th>Return cost</th>
                    <th>All cost</th>
                </tr>
                <#list RentCar as RentCars>
                    <tr>
                        <td>${RentCars.rentCar.customer.person.firstName}</td>
                        <td>${RentCars.rentCar.customer.person.lastName}</td>
                        <td>${RentCars.rentCar.customer.person.middleName}</td>
                        <td>${RentCars.rentCar.car.brandCar}</td>
                        <td>${RentCars.rentCar.car.modelCar}</td>
                        <td>${RentCars.rentCar.car.licenseNumberPlates}</td>
                        <td>${RentCars.rentCar.dateOfIssue}</td>
                        <td>${RentCars.rentCar.returnDate}</td>
                        <td>${RentCars.returnCost}</td>
                        <td>${RentCars.allCost}</td>
                    </tr>
                </#list>
            </table>

        </form>
    </div>
</div>
</body>
</html>
</@c.page>