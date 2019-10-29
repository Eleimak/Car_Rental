<#import "../common.ftl" as c/>
<@c.page title="Car List">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
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

                <th><a href="" class="btn btn-success">Brand car</a></th>
                <th>Model car</th>
                <th><div class="dropdown">
                        <a id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Cost car
                        </a>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                            <a class="dropdown-item" href="#">Car cost descending</a>
                            <a class="dropdown-item" href="#">Car cost ascending</a>
                        </div>
                    </div>
                </th>
                <th>License number plates</th>
                <th>Car year</th>
                <th><a href="/CarRentals/car/listSort" class="btn btn-success">Type</a></th>
                <th>Rental price</th>
               <#-- <th>Delete</th>
                <th>Update</th>-->
            </tr>

            <#list cars as car>
            <tr>
                <td>${car.brandCar}</td>
                <td>${car.modelCar}</td>
                <td>${car.costCar}</td>
                <td>${car.licenseNumberPlates}</td>
                <td>${car.yearCar}</td>
                <td>${car.typeCar}</td>
                <td>${car.rentalPrice}</td>
                <#--<td><a href="/CarRentals/car/delete/${car.id}" Type="Button" class="btn btn-danger" >Delete</a></td>
                <td><a href="/CarRentals/car/update/${car.id}" Type="Button" class="btn btn-primary" >Update</a></td>-->
            </tr>
        </#list>

        </table>

    </div>

    <a href="/CarRentals/car/create" Type="Button" class="btn btn-info">Add new car</a>

</div>
</body>
</html>
</@c.page>