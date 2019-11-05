<#import "../common.ftl" as c/>
<@c.page title="Update Car Rentals">
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Return car</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" Type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div class="container" >
    <fieldset>
        <legend>Return car</legend>
        <form name="RentCarForm" action="" method="POST">
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">First Name:</span>
                </div>
                <@spring.formInput "RentCarForm.customerFirstName" "class='form-control'readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Last Name:</span>
                </div>
                <@spring.formInput "RentCarForm.customerLastName" "class='form-control' readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Middle Name:</span>
                </div>
                <@spring.formInput "RentCarForm.customerMiddleName" "class='form-control' readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Brand car:</span>
                </div>
                <@spring.formInput "RentCarForm.carBrand" "class='form-control' readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Model car:</span>
                </div>
                <@spring.formInput "RentCarForm.carModel" "class='form-control' readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">License number plates:</span>
                </div>
                <@spring.formInput "RentCarForm.carNumber" "class='form-control' readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Date of issue:</span>
                </div>
            <<@spring.formInput "RentCarForm.dateOfIssue" "class='form-control' readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Return date:</span>
                </div>
                <<@spring.formInput "RentCarForm.returnDate" "class='form-control' readonly  width='276'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Rental price:</span>
                </div>
                <@spring.formInput "RentCarForm.carRentalPrice" "class='form-control' readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Return cost:</span>
                </div>
                <<@spring.formInput "RentCarForm.returnCost" "class='form-control' readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Repair cost & fine price:</span>
                </div>
                <<@spring.formInput "RentCarForm.repairCost" "class='form-control'" "text"/>
            </div>
            <br>
            <a href="/CarRentals/rentCar/list" Type="Button" class="btn btn-primary">Back</a>
            <input Type="submit" value="     Submit     " class="btn btn-danger"/>
        </form>
    </fieldset>
</div>
</body>
</html>
</@c.page>