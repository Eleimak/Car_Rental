<#import "../common.ftl" as c/>
<@c.page title="Car List">
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Add Car</title>
    <link rel="stylesheet" Type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="container" >
    <#if errorMessage??>
        <div class="alert alert-danger" role="alert">
            ${errorMessage}
        </div>
    </#if>
    <fieldset>
        <legend>Add car</legend>
        <form name="RentCarForm" action="" method="POST">
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Car:</span>
                </div>
                <@spring.formSingleSelect "RentCarForm.carID", CarList, "class='form-control'"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Customer:</span>
                </div>
                <@spring.formSingleSelect "RentCarForm.customerID", CustomerList, "class='form-control'"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Date of issue:</span>
                </div>
                <@spring.formInput "RentCarForm.dateOfIssue" "class='form-control' readonly  width='276'" "text"/>
                <script>
                    $('#dateOfIssue').datepicker({uiLibrary: 'bootstrap4'});
                </script>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Return date:</span>
                </div>
                <@spring.formInput "RentCarForm.returnDate" "class='form-control' readonly  width='276'" "text"/>
                <script>
                    $('#returnDate').datepicker({uiLibrary: 'bootstrap4'});
                </script>
            </div>
            <a href="/CarRentals/rentCar/list" Type="Button" class="btn btn-primary">Back</a>
            <input Type="submit" value="     Submit     " class="btn btn-danger"/>
        </form>
    </fieldset>
</div>
</body>
</html>
</@c.page>