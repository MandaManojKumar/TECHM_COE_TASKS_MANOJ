<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create Task</title>
</head>
<body>
    <h2>Create a New Task</h2>
    <form action="CreateTaskServlet" method="post">
        <label for="title">Task Title:</label><br>
        <input type="text" id="title" name="title"><br><br>
        
        <label for="description">Task Description:</label><br>
        <textarea id="description" name="description"></textarea><br><br>
        
        <label for="dueDate">Due Date:</label><br>
        <input type="date" id="dueDate" name="dueDate"><br><br>
        
        <label for="priority">Priority:</label><br>
        <select id="priority" name="priority">
            <option value="High">High</option>
            <option value="Medium">Medium</option>
            <option value="Low">Low</option>
        </select><br><br>
        
        <input type="submit" value="Create Task" id="createTask">
    </form>
</body>
</html>