<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <style type="text/css">
        html,body{
            background-image: url('https://wallpaperaccess.com/full/11207.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            height: 100%;
        }
    </style><title>Car List</title>
    <link rel="stylesheet"
          Type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="/">
        <img src="/docs/image/icons8-страховка-автомобиля-30.png" width="30" height="30" class="d-inline-block align-top" alt="">
        Car Rentals
    </a>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/CarRentals/customer/list">Customers list</a>
            </li>
            <li class="nav-item dropdown active">
                <a class="nav-link dropdown-toggle" href="" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Car </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="/CarRentals/car/list">Full list</a>
                    <a class="dropdown-item" href="/CarRentals/car/listR">Active list</a>
                    <a class="dropdown-item" href="/CarRentals/car/listSort">Sort list</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/CarRentals/signIn">Sign In</a>
            </li>
        </ul>
    </div>
</nav>
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

            <#list cars as car>
            <tr>
                <td>${car.brandCar}</td>
                <td>${car.costCar}</td>
                <td>${car.licenseNumberPlates}</td>
                <td>${car.carCondition}</td>
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