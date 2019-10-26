<#import "common.ftl" as c/>
<@c.page title="Car List">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Car List</title>
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Car List</h3>
    <br>
    <div>

        <table class="table table-sm table-striped table-bordered table-dark">
            <tr class="bg-success">

                <th>Brand car</th>
                <th>Cost car</th>
                <th>License number plates</th>
                <th>Car year</th>
                <th>Type</th>
                <th>Rental price</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>

            <#list cars as car>
            <tr>
                <td>${car.brandCar}</td>
                <td>${car.costCar}</td>
                <td>${car.licenseNumberPlates}</td>
                <td>${car.carYear}</td>
                <td>${car.typeCar}</td>
                <td>${car.rentalPrice}</td>
                <td><a href="/CarRentals/car/delete/${car.id}" Type="Button" class="btn btn-danger" >Delete</a></td>
                <td><a href="/CarRentals/car/update/${car.id}" Type="Button" class="btn btn-primary" >Update</a></td>
            </tr>
        </#list>

        </table>

    </div>

    <a href="/CarRentals/car/create" Type="Button" class="btn btn-info">Add new car</a>

</div>
</body>
</html>
</@c.page>