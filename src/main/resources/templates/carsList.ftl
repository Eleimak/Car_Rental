<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Car List</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div class="container-fluid" style="padding-left: 100px; padding-right: 100px " >
    <h3>Car List</h3>
    <br>
    <div>

        <table class="table table-sm table-striped table-bordered table-dark">
            <tr class="bg-success">

                <th>Brand car</th>
                <th>Cost car</th>
                <th>License number plates</th>
                <th>Car condition</th>
                <th>Car year</th>
                <th>Type</th>
                <th>Rental price</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>

            <#list car as car>
            <tr>
                <td>${car.brandCar}</td>
                <td>${car.costCar}</td>
                <td>${car.licenseNumberPlates}</td>
                <td>${car.carCondition}</td>
                <td>${car.carYear}</td>
                <td>${car.type}</td>
                <td>${car.rentalPrice}</td>
                <td><a href="/car/delete/${car.id}" type="Button" class="btn btn-danger" >Delete</a></td>
                <td><a href="/car/update/${car.id}" type="Button" class="btn btn-primary" >Update</a></td>
            </tr>
        </#list>

        </table>

    </div>

    <a href="/car/create" type="Button" class="btn btn-info">Add new car</a>

</div>
</body>
</html>