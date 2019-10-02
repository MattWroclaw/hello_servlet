<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dostęp do właściwości komponentów</title>
</head>
<body>
Dostęp do właściwości komponentów <br>
Imię: ${larry.employee.name.firstName}<br>
Nazwisko: ${employee.name.lastName}<br>
Nazwa firmy: ${employee.company.companyName}<br>
Działalność: ${employee.company.business}<br>
Działalność: ${employee}<br>
Działalność: ${employee.napis}<br>
Działalność: ${employee.company.napis}<br>
Działalność: ${employee.napis}<br>

</body>
</html>
