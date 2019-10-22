
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
    <link rel="stylesheet"Type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

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
            <a href="/CarRental/signIn" Type="Button" class="btn btn-primary">Back</a>
            <input Type="submit" value="     Next     " class="btn btn-danger"/>
        </form>
    </fieldset>
</div>

</body>
</html>