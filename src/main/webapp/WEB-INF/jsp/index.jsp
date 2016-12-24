<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Console</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <base href="/">

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/img/favicon.png">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,800,700,400italic,600italic,700italic,800italic,300italic" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/site.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

    <script src="${pageContext.request.contextPath}/resources/node_modules/zone.js/dist/zone.js"></script>
    <script src="${pageContext.request.contextPath}/resources/node_modules/reflect-metadata/Reflect.js"></script>
    <script src="${pageContext.request.contextPath}/resources/node_modules/systemjs/dist/system.src.js"></script>
    <script src="${pageContext.request.contextPath}/resources/systemjs.config.js"></script>

    <script src="${pageContext.request.contextPath}/resources/js/site.min.js"></script>

    <script>
        System.import('app').catch(function(err){ console.error(err); });
    </script>
</head>
<body>
    <root-app>Loading..</root-app>
</body>
</html>
