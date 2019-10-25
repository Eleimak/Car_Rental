
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Create Car</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" Type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" Type="text/css" />
    <link rel="stylesheet"Type="text/css" href="<@spring.url '/css/style.css'/>"/>
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
<div class="container-fluid" style="padding-left: 100px; padding-right: 100px " >
    <fieldset>
        <legend>Add car</legend>
        <form name="worker" action="" method="POST">
            First name:<@spring.formInput "WorkerForm.name" "class='form-control'" "text"/>
            <br>Occupation:<@spring.formInput "WorkerForm.occupation" "class='form-control'" "text"/>
            <br>Salary:<@spring.formInput "WorkerForm.salary" "class='form-control'" "text"/>
            <br>Speciality:<@spring.formSingleSelect "WorkerForm.speciality", mavs, "class='form-control'"/>
            <br>EmploymentDay:<@spring.formInput "WorkerForm.employmentDay" "class='form-control' readonly  width='276'" "text"/>
            <br>
            <input Type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>