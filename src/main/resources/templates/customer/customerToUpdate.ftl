<#import "../common.ftl" as c/>
<@c.page title="Sign Up">
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Customer update</title>
    <link rel="stylesheet" Type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div class="container-fluid">
    <div class="container">
    <fieldset>
        <legend>Customer update</legend>
        <form name="CustomersForm" action="" method="POST">
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
                <@spring.formSingleSelect "CustomersForm.gender", ListGender, "class='form-control'"/>
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
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Bonus points</span>
                </div>
                <@spring.formInput "CustomersForm.bonusPoints" "class='form-control' readonly" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Car list</span>
                </div>
                <@spring.formSingleSelect "CustomersForm.carList", ListCars, "class='form-control' readonly"/>
            </div>
            <br>
            <a href="/CarRentals/signIn" Type="Button" class="btn btn-primary">Back</a>
            <input Type="submit" value="     Next     " class="btn btn-danger"/>
        </form>
    </fieldset>
</div>
</div>
</body>
</html>
</@c.page>