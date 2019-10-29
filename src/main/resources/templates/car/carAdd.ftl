<#import "../common.ftl" as c/>
<@c.page title="Car List">
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Create Car</title>
    <link rel="stylesheet" Type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="container" >
    <fieldset>
        <legend>Add car</legend>
        <form name="CarForm" action="" method="POST">
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Brand car:</span>
                </div>
                <@spring.formInput "CarForm.brandCar" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Model car:</span>
                </div>
                <@spring.formInput "CarForm.modelCar" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Cost car:</span>
                </div>
                <@spring.formInput "CarForm.costCar" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">License number plates:</span>
                </div>
                <@spring.formInput "CarForm.licenseNumberPlates" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Type car:</span>
                </div>
                <@spring.formSingleSelect "CarForm.typeCar", typeCar, "class='form-control'"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Car year:</span>
                </div>
                <@spring.formSingleSelect "CarForm.yearCar", yearCar, "class='form-control'"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Rental price:</span>
                </div>
                <@spring.formInput "CarForm.rentalPrice" "class='form-control'" "text"/>
            </div>
            <br>
            <a href="/CarRentals/car/list" Type="Button" class="btn btn-primary">Back</a>
            <input Type="submit" value="     Next     " class="btn btn-danger"/>
        </form>
    </fieldset>
</div>
</body>
</html>
</@c.page>