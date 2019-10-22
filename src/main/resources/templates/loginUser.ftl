
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Sing In</title>
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" Type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" Type="text/css" />
    <link rel="stylesheet"Type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div class="container" style="padding-left: 400px; padding-right: 400px; padding-top: 200px " >
    <fieldset>
        <legend>Sing In</legend>
        <form name="LoginUser" action="" method="POST">
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Login:</span>
                </div>
                <@spring.formInput "LoginUser.login" "class='form-control'" "text"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Password:</span>
                </div>
                <@spring.formInput "LoginUser.password" "class='form-control'" "text"/>
            </div>
            <br>
            <input Type="submit" value="     Next     " class="btn btn-info"/>
            <a href="/CarRental/registration" Type="Button" class="btn btn-danger">Registration</a>
        </form>
    </fieldset>
</div>

</body>
</html>