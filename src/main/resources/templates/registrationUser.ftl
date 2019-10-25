
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Registration</title>
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" Type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" Type="text/css" />
    <link rel="stylesheet" Type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <style type="text/css">
        html,body{
            background-image: url('https://wallpaperaccess.com/full/17634.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            height: 100%;
        }
    </style>
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
            <li class="nav-item dropdown">
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
<div class="container-fluid" style="padding-left: 500px; padding-right: 500px " >
    <fieldset>
        <legend>Registration</legend>
        <form name="Customer" action="" method="POST">
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Login:</span>
                </div>
            <@spring.formInput "CustomersForm.login" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Password:</span>
                </div>
            <@spring.formInput "CustomersForm.password" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">First Name:</span>
                </div>
                <@spring.formInput "CustomersForm.firstName" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Last Name:</span>
                </div>
                <@spring.formInput "CustomersForm.lastName" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Middle Name:</span>
                </div>
                <@spring.formInput "CustomersForm.middleName" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">Gender:</span>
                    </div>
                <@spring.formSingleSelect "CustomersForm.gender", manWoman, "class='form-control'"/>
                </div>
            <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">Address:</span>
                    </div>
                <@spring.formInput "CustomersForm.address" "class='form-control'" "text"/>
                </div>
            <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">Mobile phone:</span>
                    </div>
                <@spring.formInput "CustomersForm.phone" "class='form-control'" "text"/>
                </div>
            <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">@e-mail</span>
                    </div>
                <@spring.formInput "CustomersForm.eMail" "class='form-control'" "text"/>
            </div>
            <br>
            <a href="/CarRentals/signIn" Type="Button" class="btn btn-primary">Back</a>
            <input Type="submit" value="     Next     " class="btn btn-danger"/>
        </form>
    </fieldset>
</div>

</body>
</html>