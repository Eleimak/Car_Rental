
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Create Car</title>
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" Type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" Type="text/css" />
    <link rel="stylesheet"Type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

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