<#import "../common.ftl" as c/>
<@c.page title="List car">
    <#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List car</title>
</head>
<body>
<div class="container-fluid">
    <br>
    <h3>List car</h3>
    <br>
    <div>
        <form name="CarListSearch" action="" method="POST">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Car year:</span>
            </div>
            <@spring.formSingleSelect "CarListSearchForm.carYear", YearCar, "class='form-control'"/>
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Type car:</span>
            </div>
            <@spring.formSingleSelect "CarListSearchForm.typeCar", TypeCar, "class='form-control'"/>
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">Repair car:</span>
            </div>
            <@spring.formSingleSelect "CarListSearchForm.repairCar", RepairCar, "class='form-control'"/>
            <td><a href="/CarRentals/car/List" Type="Button"  class="btn btn-success width='75'" >  Serch  </a></td>
        </div>
            <table class="table table-sm table-striped table-bordered table-dark">
                <tr class="bg-success">
                    <th>Brand car</th>
                    <th>Model car</th>
                    <th>Cost car</th>
                    <th>License number plates</th>
                    <th>Car year</th>
                    <th>Type</th>
                    <th>Rental price</th>
                    <th>Repair car</th>
                    <th>Rent car</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>

                <#list cars as car>
                    <#assign repair = "">
                    <#if car.repair == true>
                        <#assign repair = "yes">
                    <#else>
                        <#assign repair = "no">
                    </#if>
                    <#assign rent = "">
                    <#if car.rent == true>
                        <#assign rent = "yes">
                    <#else>
                        <#assign rent = "no">
                    </#if>
                    <tr>
                        <td>${car.brandCar}</td>
                        <td>${car.modelCar}</td>
                        <td>${car.costCar}</td>
                        <td>${car.licenseNumberPlates}</td>
                        <td>${car.yearCar}</td>
                        <td>${car.typeCar}</td>
                        <td>${car.rentalPrice}</td>
                        <td>${repair}</td>
                        <td>${rent}</td>
                        <td><a href="/CarRentals/car/delete/${car.id}" Type="Button" class="btn btn-danger" >Delete</a></td>
                        <td><a href="/CarRentals/car/update/${car.id}" Type="Button" class="btn btn-primary" >Update</a></td>
                    </tr>
                </#list>

            </table>
        </form>
    </div>
    <a href="/CarRentals/car/create" Type="Button" class="btn btn-info">Add new car</a>

</div>
</body>
</html>
</@c.page>