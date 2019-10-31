<#import "/spring.ftl" as spring/>
<#import "../common.ftl" as c/>
<@c.page title="Customer add">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Customer add</title>
    <link rel="stylesheet" Type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
    <div class="container">

        <legend>Customer add</legend>
        <form name="CustomerForm" action="" method="POST">
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">First Name:</span>
                </div>
                <@spring.formInput "CustomerForm.firstName" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Last Name:</span>
                </div>
                <@spring.formInput "CustomerForm.lastName" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Middle Name:</span>
                </div>
                <@spring.formInput "CustomerForm.middleName" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">Gender:</span>
                    </div>
                <@spring.formSingleSelect "CustomerForm.gender", Gender, "class='form-control'"/>
            </div>
            <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">Address:</span>
                    </div>
                <@spring.formInput "CustomerForm.address" "class='form-control'" "text"/>
                </div>
            <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">Mobile phone:</span>
                    </div>
                <@spring.formInput "CustomerForm.phone" "class='form-control'" "text="/>
                </div>
            <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1">@e-mail</span>
                    </div>
                <@spring.formInput "CustomerForm.eMail" "class='form-control'" "text"/>
            </div>
            <br>
            <a href="/CarRentals/customer/list" Type="Button" class="btn btn-primary">Back</a>
            <input Type="submit" value="     Next     " class="btn btn-danger"/>
        </form>
    </div>
</body>
</html>
</@c.page>