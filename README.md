<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CrecheApp - README</title>
</head>
<body>
    <h1>CrecheApp - README</h1>
    
  <h2>Overview</h2>
    <p>The <strong>CrecheApp</strong> is a Java application designed to manage the registration of kids in a creche. It uses <strong>Object-Oriented Programming (OOP)</strong> principles, provides a graphical user interface (GUI) for easy interaction, and leverages the <strong>ArrayList</strong> collection to store data dynamically.</p>
    
  <h2>OOP Concepts</h2>
    <p>This project demonstrates the use of core OOP principles:</p>
    <ul>
        <li><strong>Encapsulation:</strong> The <code>Kiddy</code> class encapsulates the properties of a kid (name, age, gender) using private variables and provides getter and setter methods to access and modify them.</li>
        <li><strong>Interface:</strong> The <code>KiddyInterface</code> defines methods that must be implemented by any class processing kid-related data. The <code>KidProcessor</code> class implements this interface.</li>
        <li><strong>Polymorphism:</strong> The use of interfaces allows for polymorphic behavior, where the <code>KidProcessor</code> class can be used wherever the <code>KiddyInterface</code> is expected.</li>
    </ul>
    <h2>Graphical User Interface (GUI)</h2>
    <p>The GUI is created using Java's <code>Swing</code> library. The class <code>CrecheUi</code> handles the user interface, allowing users to input the kid's name, age, and gender. The interface is structured with the following components:</p>
    <ul>
        <li><code>JTextField</code> for name and age input.</li>
        <li><code>JRadioButton</code> for selecting gender (Male or Female).</li>
        <li><code>JButton</code> to submit the registration form.</li>
        <li><code>JTextArea</code> to display the registered kid's information.</li>
    </ul>
    <p>By clicking the submit button, the data entered by the user is processed, and the information is displayed on the screen.</p>
    
   <h2>Collections - ArrayList</h2>
    <p>The <code>KidProcessor</code> class uses an <code>ArrayList</code> to store a dynamic list of registered kids. This collection allows for:</p>
    <ul>
        <li>Adding new kids with the <code>registerKid</code> method.</li>
        <li>Retrieving the list of registered kids using the <code>getKids</code> method.</li>
        <li>Counting boys registered in the system through the <code>countBoys</code> method.</li>
    </ul>
    
  <h2>Project Structure</h2>
    <ul>
        <li><code>Kiddy</code> - The model representing a kid (name, age, gender).</li>
        <li><code>KiddyInterface</code> - Interface defining methods for registering and processing kids.</li>
        <li><code>KidProcessor</code> - Implements the interface and processes the list of kids.</li>
        <li><code>CrecheUi</code> - The graphical user interface class for interacting with the user.</li>
    </ul>

  <h2>How to Run</h2>
    <p>To run the application:</p>
    <ol>
        <li>Open the project in your preferred Java IDE.</li>
        <li>Ensure that all necessary dependencies are installed (Java Swing library is required).</li>
        <li>Run the <code>CrecheApp</code> class, which will launch the GUI.</li>
    </ol>

  <h2>Conclusion</h2>
    <p>The <strong>CrecheApp</strong> is an example of how OOP principles, GUI creation, and the use of collections such as ArrayList can be applied in a Java application. It provides a simple yet effective way to register kids in a creche system and manage the data dynamically.</p>
</body>
</html>
