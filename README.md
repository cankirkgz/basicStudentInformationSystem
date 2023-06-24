<h1>Student Information System</h1>
  <h2>Table of Contents</h2>
  <ul>
    <li><a href="#features">Features</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
  </ul>
  <h2 id="features">Features</h2>
  <p>
    This is a simple student management system implemented in Java. The system allows you to create courses, assign teachers to courses, add exam notes for students, calculate their averages, and determine if they pass or fail the courses.
  </p>
  <h2 id="getting-started">Getting Started</h2>
  <p>
    To get started with the student management system, you need to have Java Development Kit (JDK) installed on your system.
  </p>
  <ol>
    <li>Clone the repository:</li>
    <code>git clone https://github.com/your-username/student-management-system.git</code>
    <li>Compile the Java source files:</li>
    <code>javac Main.java</code>
    <li>Run the program:</li>
    <code>java Main</code>
  </ol>
  <h2 id="usage">Usage</h2>
  <ol>
    <li>Create Teachers:</li>
    <ul>
      <li>Create instances of the <code>Teacher</code> class by providing the teacher's name, phone number, and branch.</li>
      <li>Example:</li>
      <pre><code>Teacher teacher1 = new Teacher("Cemil Kavakçı", "05462415532", "CLCS");
Teacher teacher2 = new Teacher("Mustafa Düldül", "05494322334", "PHY");</code></pre>
    </ul>
    <li>Create Courses:</li>
    <ul>
      <li>Create instances of the <code>Course</code> class by providing the course name, code, prefix, oral weight, and exam weight.</li>
      <li>Add the corresponding teacher to the course using the <code>addTeacher</code> method.</li>
      <li>Example:</li>
      <pre><code>Course calculus = new Course("Calculus", "101", "CLCS", 30, 60);
calculus.addTeacher(teacher1);</code></pre>
    </ul>
    <li>Create Students:</li>
    <ul>
      <li>Create instances of the <code>Student</code> class by providing the student's name, courses, student number, and class.</li>
      <li>Add exam notes for each course using the <code>addBulkExamNote</code> method.</li>
      <li>Example:</li>
      <pre><code>Student s1 = new Student("Can Kırkgöz", calculus, physic, biology, "18025029", "4");
s1.addBulkExamNote(60, 42, 73, 30, 23, 95);</code></pre>
    </ul>
    <li>View Student's Exam Notes:</li>
    <ul>
      <li>Print the exam notes for a student using the <code>printNote</code> method.</li>
      <li>Example:</li>
      <pre><code>s1.printNote();</code></pre>
    </ul>
    <li>Calculate Average and Pass/Fail Status:</li>
    <ul>
      <li>Calculate the average for a student and determine if they pass or fail using the <code>calculateAverage</code> and <code>isPass</code> methods.</li>
      <li>Example:</li>
      <pre><code>s1.calculateAverage();
s1.isPass();</code></pre>
    </ul>
  </ol>
  <h2 id="contributing">Contributing</h2>
  <p>
    Contributions to the student management system are welcome. If you find any issues or want to suggest improvements, please feel free to open an issue or submit a pull request.
  </p>
  <ol>
    <li>Fork the repository.</li>
    <li>Create a new branch for your feature or bug fix.</li>
    <li>Make the necessary changes and commit them.</li>
    <li>Push your changes to your fork.</li>
    <li>Submit a pull request.</li>
  </ol>
  <h2 id="license">License</h2>
  <p>
    This project is licensed under the MIT License. Feel free to use and modify the code as per the terms of the license.
  </p>
