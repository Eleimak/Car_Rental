<#import "../common.ftl" as c/>
<@c.page title="Car List">
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Car Rentals List</title>
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Car Rentals List</h3>
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
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
                <#list RentCar as RentCars>
                    <tr>
                        <td>${RentCars.customer.person.firstName}</td>
                        <td>${RentCars.customer.person.lastName}</td>
                        <td>${RentCars.customer.person.middleName}</td>
                        <td>${RentCars.car.brandCar}</td>
                        <td>${RentCars.car.modelCar}</td>
                        <td>${RentCars.car.licenseNumberPlates}</td>
                        <td>${RentCars.dateOfIssue}</td>
                        <td>${RentCars.returnDate}</td>
                        <td><a href="/CarRentals/rentCar/delete/${RentCars.id}" Type="Button" class="btn btn-danger" >Delete</a></td>
                        <td><a href="/CarRentals/rentCar/update/${RentCars.id}" Type="Button" class="btn btn-primary" >Update</a></td>
                    </tr>
                </#list>
            </table>

        </form>
    </div>
    <a href="/CarRentals/rentCar/create" Type="Button" class="btn btn-info">Add new rent car</a>

</div>
</body>
</html>
</@c.page>