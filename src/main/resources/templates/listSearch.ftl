<#import "common.ftl" as c/>
<@c.page title="Car List">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Car List</title>
    <link rel="stylesheet" href="/style/styleSearch.css" type="text/css">
</head>
<body>
<div class="container">
    <br>
    <h3>Car List</h3>
    <br>
    <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names..">

            <table class="table table-sm table-striped table-bordered table-dark" id="myTable">
                <tr class="bg-success">
                    <th>Search</th>
                </tr>
                <#list listFull as list>
                    <tr>
                        <th>${list}</th>
                    </tr>
                </#list>
        </table>
</div>
<script src="/javascript/js_Search.js" type="text/javascript"></script>
</body>
</html>
</@c.page>