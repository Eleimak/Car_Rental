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
    <fieldset>
        <legend>Add car</legend>
        <form name="RentCarForm" action="" method="POST">

            <a href="/CarRentals/car/list" Type="Button" class="btn btn-primary">Back</a>
            <input Type="submit" value="     Next     " class="btn btn-danger"/>
        </form>
    </fieldset>
</div>
</body>
</html>
</@c.page>